package com.itheima.job_day10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	/*��ӡ��
	 * 	PrintWriter
	 * 	PrintStream
	 * */
	public static void main(String[] args) throws IOException {
		//PrintWriter pw=new PrintWriter("s.txt");
		/*pw.write("hello");
		pw.write("word");
		pw.write("java");*/
		
		//�Զ�����
	/*	pw.println("hello");
		pw.println("word");
		pw.println("java");*/
		//�Զ�ˢ��
		PrintWriter pw=new PrintWriter(new FileWriter("s.txt"),true);
		pw.println("hello");
		pw.println("word");
		pw.println("java");
		
		pw.close();
	}
}	
