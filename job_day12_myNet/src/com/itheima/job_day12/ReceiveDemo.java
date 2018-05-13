package com.itheima.job_day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*UDP连接接受端*/
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端socket
		DatagramSocket ds=new DatagramSocket(9999);
		//接受数据
		byte[] bs=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bs, bs.length);
		System.out.println("服务器启动...");
		while(true){
			ds.receive(dp);
			//解析数据并打印
			InetAddress ip=dp.getAddress();
			byte[] datas=dp.getData();
			int len=dp.getLength();
			System.out.println(ip.getHostName()+":"+new String(datas));
		}
		//释放资源
		//ds.close();
	}
}
