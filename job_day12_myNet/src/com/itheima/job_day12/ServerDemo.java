package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*TCP����,��������*/
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//������������Socket����
		ServerSocket ss=new ServerSocket(54088);
		//����
		Socket s=ss.accept();
		//��ȡ����������
		InputStream is= s.getInputStream();
		//��ȡ����(����ӡ)
		int len;
		byte[] by=new byte[1024];
		while((len=is.read(by))!=-1){
			System.out.println(new String(by,0,len));
		}
		//�ͷ���Դ
		s.close();
		ss.close();
	}
}
