package com.itheima.homework.job_day09;

import java.io.File;
import java.util.Scanner;

public class Test2 {
	/*�ڶ��⣺�����������󣬲��ô���ʵ��	
	�Ӽ��̽���һ���ļ���·��,ɾ�����ļ���,������Ŀ¼
	(��Ҫ��������ϵͳ�̷��µ�����)*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫɾ�����ļ���·��:");
		String url=sc.nextLine();
		File f=new File(url);
		deleteDir(f);
	}

	private static void deleteDir(File f) {
		if(f.isDirectory()){//�����һ���ļ���,�ݹ�ɾ��
			File[] files=f.listFiles();
			for (File file : files) {
				deleteDir(file);
			}
		}
		f.delete();
		/*if(f.isFile()){
		 * ɾ��f
		 * }else if(f.isDirectory(){
		 * �ݹ�ɾ��f
		 * }
		 * 
		 * ��ֻд����,��ɾ�������ļ���
		*/
		
	}
}
