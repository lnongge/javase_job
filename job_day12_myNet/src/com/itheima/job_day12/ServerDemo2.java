package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
	/* TCP连接,服务器端
	 * 需求:
	 * 客户端发送数据
	 * 服务器接受数据
	 * 服务器转换数据
	 * 服务器发出数据
	 * 客户端接受数据
	 * */
	public static void main(String[] args) throws IOException {
		// 创建服务器端Socket对象
		ServerSocket ss = new ServerSocket(43210);
		// 监听
		Socket s = ss.accept();
		// 获取输入流对象
		InputStream is = s.getInputStream();
		// 获取数据(并打印)
		OutputStream os=s.getOutputStream();
		System.out.println("服务器启动...");
			int len;
			byte[] by = new byte[1024];
			while ((len = is.read(by)) != -1) {
				String str=new String(by,0,len);
				//转成大写并写会给客户端
				byte[] bys=str.toUpperCase().getBytes();
				os.write(bys);
			}
		is.close();
		os.close();
		s.close();
		ss.close();//服务器一般是不关的
	}
}
