package com.itheima.job_day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
	/*
	 * ���ֽ��������ı��ļ�
	 * */
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("test.doc");
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Java\\temp\\test.doc");
		
		/*//һ�ζ�ȡһ���ֽ�
		int len;
		while((len=fis.read())!=-1){
			fos.write(len);
		}*/
		
		//һ�ζ�ȡһ���ֽ�����
		int len;
		byte[] bys=new byte[1024];
		while((len=fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
		
		fis.close();
		fos.close();
	}
}
