package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
	/* TCP����,��������
	 * ����:
	 * �ͻ��˷�������
	 * ��������������
	 * ������ת������
	 * ��������������
	 * �ͻ��˽�������
	 * */
	public static void main(String[] args) throws IOException {
		// ������������Socket����
		ServerSocket ss = new ServerSocket(43210);
		// ����
		Socket s = ss.accept();
		// ��ȡ����������
		InputStream is = s.getInputStream();
		// ��ȡ����(����ӡ)
		OutputStream os=s.getOutputStream();
		System.out.println("����������...");
			int len;
			byte[] by = new byte[1024];
			while ((len = is.read(by)) != -1) {
				String str=new String(by,0,len);
				//ת�ɴ�д��д����ͻ���
				byte[] bys=str.toUpperCase().getBytes();
				os.write(bys);
			}
		is.close();
		os.close();
		s.close();
		ss.close();//������һ���ǲ��ص�
	}
}
