package com.itheima.job_day09;

import java.io.File;
import java.util.Date;

public class FileDemo3 {
	/*File的获取功能*/
	public static void main(String[] args) {
		/*
		 * File getAbsoluteFile()  ：以File对象的形式返回当前File对象所有指向的绝对路径
		 * String getAbsolutePath() : 以String形式返回File对象所指向的绝对路径
		*/
		File f1=new File("a.txt");
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getAbsoluteFile());
		
		/*
		 * String getParent() :以字符串形式返回file对象最后一级路径前面所有的路径
		 * File getParentFile() : 获取除了最后一级路径前面所有的路径,注意返回值为File
		 */
		System.out.println(f1.getParentFile());
		System.out.println(f1.getParent());//都是null
		File f2=new File("a\\b\\c");
		System.out.println(f2.getParentFile());
		System.out.println(f2.getParent());//都是a\b
		/*
		 * String getName() : 获取路径的最后一级名字,返回路径的字符串形式(文件文件夹都可以获取)
		 */
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		/*
		 * long lastModified() : 以毫秒值的形式返回最后修改时间
		 */
		Long l1=f1.lastModified();
		System.out.println(l1);
		System.out.println(new Date(l1).toLocaleString());
		
		/*
		 * long length() : 返回文件的字节数
		 */
		System.out.println(f1.length());
		System.out.println(f2.length());//0,因为f2不是文件而是文件夹
		/*
		 * String getPath() : 返回创建File对象时给的路径
		 */
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		
		//删除文件
	}
}
