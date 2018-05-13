package com.itheima.job_day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
	/*
	 * 用字节流复制文本文件
	 * */
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("test.doc");
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Java\\temp\\test.doc");
		
		/*//一次读取一个字节
		int len;
		while((len=fis.read())!=-1){
			fos.write(len);
		}*/
		
		//一次读取一个字节数组
		int len;
		byte[] bys=new byte[1024];
		while((len=fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
		
		fis.close();
		fos.close();
	}
}
