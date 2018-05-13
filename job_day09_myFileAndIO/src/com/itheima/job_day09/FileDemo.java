package com.itheima.job_day09;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	/*File构造方法
	 **/
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\develop\\temp\\a.txt");
		File f2=new File("D:\\develop","\\temp\\b.txt");
		File f3=new File(f1,"c.txt");
		//创建文件及文件夹
		System.out.println(f1.createNewFile());
		
		File f4=new File("c");
		System.out.println(f4.mkdir());
		
		File f5=new File("a\\b\\c");//f5带i包一个多级文件夹
		System.out.println(f5.mkdir());//返回false创建失败,因为其只能创建单级文件夹
		System.out.println(f5.mkdirs());
		
		//创建文件及文件夹
				File f6=new File("c.txt");
				System.out.println(f6.createNewFile());
				File f7=new File("a.txt");
				System.out.println(f6.renameTo(f7));
		
	}
}	
