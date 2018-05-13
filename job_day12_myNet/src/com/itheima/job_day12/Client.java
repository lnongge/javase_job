package com.itheima.job_day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
	/*UDP连接,尝试做个既可以又可以收的(没完成,可不看)*/
public class Client {
	public static void main(String[] args) throws IOException {
		//创建发送端socket对象
		DatagramSocket dsSend=new DatagramSocket();
		//创建数据并打包
		Scanner sc=new Scanner(System.in);
		InetAddress ip1=InetAddress.getByName("lianws");
		Thread th=new Thread(new Service(),"服务器");
		th.start();
		while(true){
			//发送端启动
			String data=sc.nextLine();
			byte[] bs1=data.getBytes();
			int length=bs1.length;
			int port=9900;
			
			//InetAddress ip=InetAddress.getByName("USER-20180209VG");
			DatagramPacket dp1=new DatagramPacket(bs1, length, ip1, port);
			//发送数据
			dsSend.send(dp1);
		}
	}
	
}
