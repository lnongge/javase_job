package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*TCP连接,服务器端*/
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建服务器端Socket对象
		ServerSocket ss=new ServerSocket(54088);
		//监听
		Socket s=ss.accept();
		//获取输入流对象
		InputStream is= s.getInputStream();
		//获取数据(并打印)
		int len;
		byte[] by=new byte[1024];
		while((len=is.read(by))!=-1){
			System.out.println(new String(by,0,len));
		}
		//释放资源
		s.close();
		ss.close();
	}
}
