package com.itheima.job_day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*UDP���ӽ��ܶ�*/
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//�������ն�socket
		DatagramSocket ds=new DatagramSocket(9999);
		//��������
		byte[] bs=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bs, bs.length);
		System.out.println("����������...");
		while(true){
			ds.receive(dp);
			//�������ݲ���ӡ
			InetAddress ip=dp.getAddress();
			byte[] datas=dp.getData();
			int len=dp.getLength();
			System.out.println(ip.getHostName()+":"+new String(datas));
		}
		//�ͷ���Դ
		//ds.close();
	}
}
