package com.itheima.job_day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
	/*UDP����,���������ȿ����ֿ����յ�(û���,�ɲ���)*/
public class Client {
	public static void main(String[] args) throws IOException {
		//�������Ͷ�socket����
		DatagramSocket dsSend=new DatagramSocket();
		//�������ݲ����
		Scanner sc=new Scanner(System.in);
		InetAddress ip1=InetAddress.getByName("lianws");
		Thread th=new Thread(new Service(),"������");
		th.start();
		while(true){
			//���Ͷ�����
			String data=sc.nextLine();
			byte[] bs1=data.getBytes();
			int length=bs1.length;
			int port=9900;
			
			//InetAddress ip=InetAddress.getByName("USER-20180209VG");
			DatagramPacket dp1=new DatagramPacket(bs1, length, ip1, port);
			//��������
			dsSend.send(dp1);
		}
	}
	
}
