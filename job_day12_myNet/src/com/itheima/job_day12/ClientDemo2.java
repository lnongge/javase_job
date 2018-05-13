package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo2 {
	/* TCP连接,客户端
	 * 需求:
	 * 客户端发送数据
	 * 服务器接受数据
	 * 服务器转换数据
	 * 服务器发出数据
	 * 客户端接受数据
	 * */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建客户端Socket对象
		Socket s = new Socket(InetAddress.getByName("lianws"), 43210);
		// 创建输出流对象
		OutputStream os = s.getOutputStream();
		// 发送数据
		//创建输入流
		InputStream is = s.getInputStream();
		System.out.println("客户端启动...");

		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			byte[] by = str.getBytes();
			os.write(by);
			
			// 接收来自服务器的反馈数据
			int len;
			byte[] bys=new byte[1024];
			len=is.read(bys);
			System.out.println(new String(bys,0,len));
			
		}
		
		//释放资源
		//os.close();
		//is.close();
		

		
	}
}
