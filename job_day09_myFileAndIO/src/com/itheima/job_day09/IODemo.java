package com.itheima.job_day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	/*
	 * ��ϰ:�ַ�����\�����
	 * */
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("test.doc");
		FileWriter fw=new FileWriter("D:\\develop\\Java\\temp\\test2.doc");
		
		//һ�ζ�ȡһ���ַ�
		/*int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
			fw.flush();
		}*/
		
		//һ�ζ�ȡһ���ַ�����
		int len;
		char[] chs=new char[1024];
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
			fw.flush();
		}
		
		fr.close();
		fw.close();
				
	}
}
