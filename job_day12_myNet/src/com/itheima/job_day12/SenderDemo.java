package com.itheima.job_day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/*UDP连接,发送端*/
public class SenderDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端socket对象
		DatagramSocket ds=new DatagramSocket();
		//创建数据并打包
		Scanner sc=new Scanner(System.in);
		while(true){
			String data=sc.nextLine();
			byte[] bs=data.getBytes();
			int length=bs.length;
			int port=5488;
			InetAddress ip=InetAddress.getByName("DESKTOP-VENGI90");
			//InetAddress ip=InetAddress.getByName("USER-20180209VG");
			DatagramPacket dp=new DatagramPacket(bs, length, ip, port);
			//发送数据
			ds.send(dp);
		}
		//释放资源
		//ds.close();
	}
}
