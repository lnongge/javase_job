package com.itheima.job_day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
	/*
	 * ʹ���ֽ��������������ͼƬ
	 * */
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("G:\\2018���ź����ҵ��\\temp\\liuyan.jpg");
		FileOutputStream fos=new FileOutputStream("liuyan.jpg");
		//һ�ζ�ȡһ���ֽ�
		int ch;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		
		/*
		//һ�ζ�ȡһ���ֽ�����
		int len;
		byte[] bys=new byte[1024];
		while((len=fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}*/
		
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
}	
