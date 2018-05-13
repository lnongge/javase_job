package com.itheima.job_day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
	/*
	 * 使用字节输入输出流复制图片
	 * */
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("G:\\2018厦门黑马就业班\\temp\\liuyan.jpg");
		FileOutputStream fos=new FileOutputStream("liuyan.jpg");
		//一次读取一个字节
		int ch;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		
		/*
		//一次读取一个字节数组
		int len;
		byte[] bys=new byte[1024];
		while((len=fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}*/
		
		//释放资源
		fis.close();
		fos.close();
	}
}	
