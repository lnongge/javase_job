package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class LoginDemo {
	/*ģ���û���¼*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		//��������socket����
		Socket s=new Socket(InetAddress.getByName("lianws"),10086);
		//���������
		OutputStream os = s.getOutputStream();//����д���õ����ֽ���,����ʹ�ô�ӡ��PrintWriter����s.getOutputStream()����
		//��������
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���:");
		String str=sc.nextLine();
		System.out.println("����������:");
		String psd=sc.nextLine();
		//���͸��ͷ���
		os.write(str.getBytes());
		os.write(psd.getBytes());
		//���շ������ķ�����Ϣ
		InputStream is=s.getInputStream();//�������Ҳ�����õ����ֽ���,����ʹ�ø�Ч��.��ת����ת
		int len;
		byte[] bys=new byte[1024];
		len=is.read(bys);
		System.out.println(new String(bys,0,len));
		/*while((len=is.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}*/
		is.close();
		os.close();
		s.close();
	}
}
