package com.itheima.job_day12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
/*TCP����,�ͻ���*/
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//�����ͻ���Socket����
		Socket s=new Socket(InetAddress.getByName("DESKTOP-VENGI90"),43210);
		//�������������
		OutputStream os = s.getOutputStream();
		//��������
		System.out.println("�ͻ�������...");
		while(true){
			//String str="��,ѧ����";
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			byte[] by=str.getBytes();
			os.write(by);
		}
		
		//�ͷ���Դ
		//os.flush();
	}
}
