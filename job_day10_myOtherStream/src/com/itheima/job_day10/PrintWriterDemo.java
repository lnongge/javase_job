package com.itheima.job_day10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	/*打印流
	 * 	PrintWriter
	 * 	PrintStream
	 * */
	public static void main(String[] args) throws IOException {
		//PrintWriter pw=new PrintWriter("s.txt");
		/*pw.write("hello");
		pw.write("word");
		pw.write("java");*/
		
		//自动换行
	/*	pw.println("hello");
		pw.println("word");
		pw.println("java");*/
		//自动刷新
		PrintWriter pw=new PrintWriter(new FileWriter("s.txt"),true);
		pw.println("hello");
		pw.println("word");
		pw.println("java");
		
		pw.close();
	}
}	
