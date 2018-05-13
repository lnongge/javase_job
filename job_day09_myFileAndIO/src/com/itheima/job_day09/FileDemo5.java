package com.itheima.job_day09;

import java.io.File;

public class FileDemo5 {
	/*1输出指定目录下的所有.java文件(包括子目录下的)
	 *2删除指定目录下的所有文件(包括子目录和自己)
	 * */
	
	public static void main(String[] args) {
		File f=new File("src");
		File f1=new File("a.txt");
		printFile(f);
		
		//删除自定目录下的所有文件
		File f2=new File("D:\\develop\\Java\\eclipse\\workspace_javajob");
		deleteFile(f2);
	}

	private static void deleteFile(File f2) {
		//如果f2是文件夹,删除子目录
		if(f2.isDirectory()){
			File[] files=f2.listFiles();
			for (File file : files) {
				if(file.isFile()){//是文件直接删除
					file.delete();
				}else{//是文件夹,递归删除
					deleteFile(file);
				}
			}
		}
		//删除自己
		f2.delete();
	}

	private static void printFile(File f) {
		//如果没有这个if,当传入的f是一个文件时,调用File[] files=f.listFiles();会返回null
		//,再下一步foreach遍历会报空指针异常
		if(f.isDirectory()){//如果传入f的是一个文件夹
			File[] files=f.listFiles();
			for (File file : files) {
				if(file.isFile()){//是一个文件
					if(file.getName().endsWith(".java"))
						System.out.println(file.getName());//输出文件名
				}else{//是一个子目录
					printFile(file);//递归输出子目录下的所有.java文件
				}
			}
		}else{//f是一个文件,文件是没有子目录的
			System.out.println("路径不对");
		}
	}
}
