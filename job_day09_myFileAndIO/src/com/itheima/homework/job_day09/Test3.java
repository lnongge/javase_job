package com.itheima.homework.job_day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
	/*键盘录入源文件夹和目标文件夹，
	 *将源文件夹(包含内容)复制到目标文件夹中，
	 *控制台打印复制的文件名称
	 * */
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入源文夹路径:");
		String start=sc.nextLine();
		System.out.println("请输入目标文件夹路径:");
		String end=sc.nextLine();
		File src=new File(start);
		File dest=new File(end);
		copy(src,dest);
		
	}

	private static void copy(File src, File dest) throws IOException {
		if(!src.exists()){
			System.out.println("输入有误,源文件"+src+"不存在!");
			return;
		}
		if(!dest.exists()){
			System.out.println("输入有误,目标文件"+dest+"不存在!");
			return;
		}
		if(src.isDirectory()&&dest.isFile()){//src是文件夹,而dest是文件
			System.out.println("输入有误,目标文件"+dest+"和源文件"+src+"不是可以复制的!");
			return;
		}
		//两个都是文件夹
	if(src.isDirectory()&&dest.isDirectory()){
			//先在目标文件下创建一个与src同名的文件夹
			File newDir=new File(dest,src.getName());
			if(!newDir.exists())
				newDir.mkdir();
			//对src下文件复制到dest下
			File[] files=src.listFiles();
			for (File file : files) {
				if(file.isFile()){//文件之间复制
					FileInputStream fis=new FileInputStream(file);
					FileOutputStream fos=new FileOutputStream(new File(newDir,file.getName()));//
					//这里fos也可以这样写
					//FileOutputStream fos=new FileOutputStream(newDir+"\\"+file.getName());
					//一次读写一个字节数组
					int len;
					byte[] bys=new byte[1024];
					while((len=fis.read(bys))!=-1){
						fos.write(bys);
					}
					fis.close();
					fos.close();
					System.out.println(file.getName());
				}else if(file.isDirectory()){
					copy(file,newDir);
				}
			}
			
		}
	/*//两个都是文件
	if(src.isFile()&&dest.isFile()){
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(dest);
		int len;
		while((len=fis.read())!=-1){
			fos.write(len);
		}
		System.out.println(src.getName());
		fis.close();
		fos.close();
	}
	//src是文件,dest是文件夹
	if(src.isFile()&&dest.isDirectory()){
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(new File(dest,src.getName()));
		int len;
		while((len=fis.read())!=-1){
			fos.write(len);
		}
		System.out.println(src.getName());
		fis.close();
		fos.close();
	}*/
	//上述2个if重复度高,可以写在一起
	//综合判断其他2种情况(src是文件,dest是文件和src是文件,dest是文件夹)
		if(src.isFile()){
			FileInputStream fis=new FileInputStream(src);
			FileOutputStream fos=dest.isFile()?new FileOutputStream(dest):new FileOutputStream(new File(dest,src.getName()));
			//这里用三元运算符判断
			//如果dest是一个文件(直接写入)fos=new FileOutputStream(dest)
			//如果dest是一个文件夹(要拼接写入的路径)fos=new FileOutputStream(new File(dest,src.getName())
			int len;
			while((len=fis.read())!=-1){
				fos.write(len);
			}
			System.out.println(src.getName());
			fis.close();
			fos.close();
		}
		
	}
}
