package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo2 {
	/* TCP����,�ͻ���
	 * ����:
	 * �ͻ��˷�������
	 * ��������������
	 * ������ת������
	 * ��������������
	 * �ͻ��˽�������
	 * */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// �����ͻ���Socket����
		Socket s = new Socket(InetAddress.getByName("lianws"), 43210);
		// �������������
		OutputStream os = s.getOutputStream();
		// ��������
		//����������
		InputStream is = s.getInputStream();
		System.out.println("�ͻ�������...");

		while(true){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			byte[] by = str.getBytes();
			os.write(by);
			
			// �������Է������ķ�������
			int len;
			byte[] bys=new byte[1024];
			len=is.read(bys);
			System.out.println(new String(bys,0,len));
			
		}
		
		//�ͷ���Դ
		//os.close();
		//is.close();
		

		
	}
}
