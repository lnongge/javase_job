package com.itheima.job_day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/*UDP����,���Ͷ�*/
public class SenderDemo {
	public static void main(String[] args) throws IOException {
		//�������Ͷ�socket����
		DatagramSocket ds=new DatagramSocket();
		//�������ݲ����
		Scanner sc=new Scanner(System.in);
		while(true){
			String data=sc.nextLine();
			byte[] bs=data.getBytes();
			int length=bs.length;
			int port=5488;
			InetAddress ip=InetAddress.getByName("DESKTOP-VENGI90");
			//InetAddress ip=InetAddress.getByName("USER-20180209VG");
			DatagramPacket dp=new DatagramPacket(bs, length, ip, port);
			//��������
			ds.send(dp);
		}
		//�ͷ���Դ
		//ds.close();
	}
}
