package com.itheima.job_day09;

import java.io.File;

public class FileDemo4 {
	/*File类的重要获取功能*/
	public static void main(String[] args) {
		File f1=new File("a.txt");
		File f2=new File("a\\b\\c");
		File f3=new File("D:\\develop\\java\\eclipse");
		
		//
		String[] strs=f3.list();
		for (String str: strs) {
			System.out.println(str);
		}
		System.out.println("--------");
		File[] files=f3.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
		System.out.println(File.listRoots());
	}
}
