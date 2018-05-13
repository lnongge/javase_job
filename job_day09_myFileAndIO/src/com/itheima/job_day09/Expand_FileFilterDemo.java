package com.itheima.job_day09;

import java.io.File;
import java.io.FileFilter;

public class Expand_FileFilterDemo {
	/*�ļ�������
	 * 
	 * */
	public static void main(String[] args) {
		File f=new File("G:\\temp");
		//File[] files=f.listFiles();//��ʹ���ļ�������
		//File[] files=f.listFiles(new MyFileFilter());//ʹ���ⲿ����ʽ���ļ�������
		//File[] files=f.listFiles(new Expand_FileFilterDemo().new MyFileFileter2());//ʹ���ڲ�����ʽ���ļ�������
		File[] files=f.listFiles( new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".docx");
			}
		});//ʹ�������ڲ������ʽ���ļ�������
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
