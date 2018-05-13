package com.itheima.homework.job_day09;

import java.io.File;
import java.util.Scanner;

public class Test2 {
	/*第二题：分析以下需求，并用代码实现	
	从键盘接收一个文件夹路径,删除该文件夹,包含子目录
	(不要操作电脑系统盘符下的内容)*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要删除的文件夹路径:");
		String url=sc.nextLine();
		File f=new File(url);
		deleteDir(f);
	}

	private static void deleteDir(File f) {
		if(f.isDirectory()){//如果是一个文件夹,递归删除
			File[] files=f.listFiles();
			for (File file : files) {
				deleteDir(file);
			}
		}
		f.delete();
		/*if(f.isFile()){
		 * 删除f
		 * }else if(f.isDirectory(){
		 * 递归删除f
		 * }
		 * 
		 * 如只写这样,会删不掉空文件夹
		*/
		
	}
}
