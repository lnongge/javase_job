package com.itheima.homework.job_day09;

import java.io.File;
import java.util.Scanner;

public class Test1 {
	/*第一题：分析以下需求，并用代码实现
	从键盘接收一个文件夹路径,统计该文件夹大小
	要求：
	1.定义public static File getFile()方法，对键盘录入的字符串进行判断，
	文件路径不存在或者录入的不是文件夹路径，则继续录入直到录入的是文件夹路径，并返回。
	2.定义public static long getLength(File file)，记录文件夹大小
	3.main方法中调用以上两个方法，计算文件夹大小
	*/
	public static void main(String[] args) {
		File f=getFile();
		
		long fileSize=getLength(f);
		System.out.println("文件大小是:"+fileSize);
		
	}

	private static long getLength(File f) {
		int sumSize=0;
		if(f.isDirectory()){//f是文件夹
			File[] files=f.listFiles();
			for (File file : files) {
				if(file.isFile()){
					sumSize+=file.length();
				}else if(file.isDirectory()){
					sumSize+=getLength(file);
				}
			}
		}else{//f是文件,把f的大小之间加到sumSize---仅本题而言这个esle可不要,因为调用getLength()之前肯定调用getFile() 而getFile()里面有判断
			//(建议加上这样我本方功能比较强大,既可以计算文件夹大小也可以计算文件大小)
			
			sumSize+=f.length();
		}
		
		
		return sumSize;
	}

	public static File getFile() {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("请输入文件夹路径:");
			String url=sc.nextLine();
			File f=new File(url);
			if(f.isDirectory()||f.isFile()){//输入的是文件路径
				if(f.exists()){//文件存在,返回该文件
					return f;
				}else{//文件夹不存在
					System.out.println("文件夹不存在,请重新输入!");
				}
				
			}else{//输入的路径不是文件路径
				System.out.println("你输入的路径格式有误,请重新输入!");
			}
		}
	}
}
