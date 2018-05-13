package com.itheima.job_day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Service implements Runnable{

	@Override
	public void run() {
		//�������ն�socket
		DatagramSocket ds=null;
		try {
			ds=new DatagramSocket(9900);
		} catch (SocketException e) {
			
		}
		//��������
		byte[] bs=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bs, bs.length);
		System.out.println("����������...");
		while(true){
			InetAddress ip=dp.getAddress();
			byte[] datas=dp.getData();
			int len=dp.getLength();
			System.out.println(ip.getHostName()+":"+new String(datas));
			try {
				ds.receive(dp);
			} catch (IOException e) {
				
			}
		}
		
	}

}
