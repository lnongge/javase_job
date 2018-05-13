package com.itheima.job_day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesDemo {
	/*
	 * void load(Reader reader) //读----- void load(InputStream
	 * inStream)从输入流中读取属性列表（键和元素对）。
	 * 
	 * //写 void list(PrintWriter out)------- void list(PrintStream out)
	 * 将属性列表输出到指定的输出流。 void store(Writer writer, String comments)
	 * 
	 */
	public static void main(String[] args) throws IOException {
		 method1();

		 method2();
		
		
		
		

	}

	public static void method2() throws FileNotFoundException, IOException {
		// p.txt-->Properties: 读 输入:load(字节/字符输入流)
		FileInputStream fis = new FileInputStream("p.txt");// 字节输出流
		// FileReader fr=new FileReader("p.txt");
		Properties p2 = new Properties();
		p2.load(fis);
		fis.close();
		System.out.println(p2);
	}

	public static void method1() throws IOException {
		// Properties-->p.txt: 写
		Properties prop = new Properties();
		prop.put("乔峰", "降龙十八掌");
		prop.put("段誉", "六脉神剑");
		prop.put("虚竹", "北冥神功");
		// PrintWriter pw=new PrintWriter("p.txt");
		PrintStream ps = new PrintStream("p.txt");// 字节打印流输出
		// PrintStream ps=new Printtream(new
		// FileOutputStream("p.txt"));//字节打印流输出
		// prop.list(ps);
		prop.store(ps, null);
		ps.flush();// 也需要刷新或关流才行
		ps.close();
	}
}
