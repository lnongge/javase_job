package com.itheima.job_day12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
/*TCP连接,客户端*/
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建客户端Socket对象
		Socket s=new Socket(InetAddress.getByName("DESKTOP-VENGI90"),43210);
		//创建输出流对象
		OutputStream os = s.getOutputStream();
		//发送数据
		System.out.println("客户端启动...");
		while(true){
			//String str="滴,学生卡";
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			byte[] by=str.getBytes();
			os.write(by);
		}
		
		//释放资源
		//os.flush();
	}
}
