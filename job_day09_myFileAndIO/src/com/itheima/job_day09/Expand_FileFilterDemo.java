package com.itheima.job_day09;

import java.io.File;
import java.io.FileFilter;

public class Expand_FileFilterDemo {
	/*文件过虑器
	 * 
	 * */
	public static void main(String[] args) {
		File f=new File("G:\\temp");
		//File[] files=f.listFiles();//不使用文件过滤器
		//File[] files=f.listFiles(new MyFileFilter());//使用外部类形式的文件过滤器
		//File[] files=f.listFiles(new Expand_FileFilterDemo().new MyFileFileter2());//使用内部类形式的文件过滤器
		File[] files=f.listFiles( new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".docx");
			}
		});//使用匿名内部类的形式的文件过滤器
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
	public class MyFileFileter2 implements FileFilter{

		@Override
		public boolean accept(File pathname) {
			return pathname.getName().endsWith(".png");
		}
		
	}
}
