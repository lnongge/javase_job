package com.itheima.job_day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	/*
	 * 复习:字符输入\输出流
	 * */
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("test.doc");
		FileWriter fw=new FileWriter("D:\\develop\\Java\\temp\\test2.doc");
		
		//一次读取一个字符
		/*int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
			fw.flush();
		}*/
		
		//一次读取一个字符数组
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
