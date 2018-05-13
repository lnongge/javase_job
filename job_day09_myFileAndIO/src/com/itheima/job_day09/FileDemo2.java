package com.itheima.job_day09;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	/*File的判断功能*/
	public static void main(String[] args) throws IOException {
//		File f=new  File("a.txt");
//		System.out.println(f.exists());//false
		
		File f=new File("a.txt");
		f.createNewFile();
		System.out.println(f.exists());//返回true
		
		//isAbsolute()
		File f1=new File("D:\\develop");
		System.out.println(f1.isAbsolute());//true
		System.out.println(f.isAbsolute());//false
	}
}
