package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class LoginServer {
	/*�û���¼�ķ�������*/
	public static void main(String[] args) throws IOException {
		System.out.println("����������..");
		//����������socket
		ServerSocket ss=new ServerSocket(10086);
		//����
		Socket s=ss.accept();
		//����������
		InputStream is=s.getInputStream();//�������Ҳ�����õ����ֽ���,����ʹ�ø�Ч��.��ת����ת
		//��������
		byte[] by=new byte[1024];
		int len=is.read(by);
		String name=new String(by,0,len);
		System.out.println(name);
		int len2=is.read(by);
		String psd=new String(by,0,len2);
		User u=new User(name,psd);
		System.out.println(psd);
		//�жϽ�������ظ��ͷ���
		OutputStream os=s.getOutputStream();////����д���õ����ֽ���,����ʹ�ô�ӡ��PrintWriter����s.getOutputStream()����
		if(UserDB.getList().contains(u)){
			os.write("��¼�ɹ�".getBytes());
		}else{
			os.write("��¼ʧ��".getBytes());
		}
		
		//�ͷ���Դ
		os.close();
		is.close();
		s.close();
		//ss.close();
	}
}
