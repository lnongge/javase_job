package com.itheima.job_day09;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	/*File���췽��
	 **/
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\develop\\temp\\a.txt");
		File f2=new File("D:\\develop","\\temp\\b.txt");
		File f3=new File(f1,"c.txt");
		//�����ļ����ļ���
		System.out.println(f1.createNewFile());
		
		File f4=new File("c");
		System.out.println(f4.mkdir());
		
		File f5=new File("a\\b\\c");//f5��i��һ���༶�ļ���
		System.out.println(f5.mkdir());//����false����ʧ��,��Ϊ��ֻ�ܴ��������ļ���
		System.out.println(f5.mkdirs());
		
		//�����ļ����ļ���
				File f6=new File("c.txt");
				System.out.println(f6.createNewFile());
				File f7=new File("a.txt");
				System.out.println(f6.renameTo(f7));
		
	}
}	
