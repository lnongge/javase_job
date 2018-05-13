package com.itheima.homework.job_day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
	/*����¼��Դ�ļ��к�Ŀ���ļ��У�
	 *��Դ�ļ���(��������)���Ƶ�Ŀ���ļ����У�
	 *����̨��ӡ���Ƶ��ļ�����
	 * */
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		System.out.println("������Դ�ļ�·��:");
		String start=sc.nextLine();
		System.out.println("������Ŀ���ļ���·��:");
		String end=sc.nextLine();
		File src=new File(start);
		File dest=new File(end);
		copy(src,dest);
		
	}

	private static void copy(File src, File dest) throws IOException {
		if(!src.exists()){
			System.out.println("��������,Դ�ļ�"+src+"������!");
			return;
		}
		if(!dest.exists()){
			System.out.println("��������,Ŀ���ļ�"+dest+"������!");
			return;
		}
		if(src.isDirectory()&&dest.isFile()){//src���ļ���,��dest���ļ�
			System.out.println("��������,Ŀ���ļ�"+dest+"��Դ�ļ�"+src+"���ǿ��Ը��Ƶ�!");
			return;
		}
		//���������ļ���
	if(src.isDirectory()&&dest.isDirectory()){
			//����Ŀ���ļ��´���һ����srcͬ�����ļ���
			File newDir=new File(dest,src.getName());
			if(!newDir.exists())
				newDir.mkdir();
			//��src���ļ����Ƶ�dest��
			File[] files=src.listFiles();
			for (File file : files) {
				if(file.isFile()){//�ļ�֮�临��
					FileInputStream fis=new FileInputStream(file);
					FileOutputStream fos=new FileOutputStream(new File(newDir,file.getName()));//
					//����fosҲ��������д
					//FileOutputStream fos=new FileOutputStream(newDir+"\\"+file.getName());
					//һ�ζ�дһ���ֽ�����
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
	/*//���������ļ�
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
	//src���ļ�,dest���ļ���
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
	//����2��if�ظ��ȸ�,����д��һ��
	//�ۺ��ж�����2�����(src���ļ�,dest���ļ���src���ļ�,dest���ļ���)
		if(src.isFile()){
			FileInputStream fis=new FileInputStream(src);
			FileOutputStream fos=dest.isFile()?new FileOutputStream(dest):new FileOutputStream(new File(dest,src.getName()));
			//��������Ԫ������ж�
			//���dest��һ���ļ�(ֱ��д��)fos=new FileOutputStream(dest)
			//���dest��һ���ļ���(Ҫƴ��д���·��)fos=new FileOutputStream(new File(dest,src.getName())
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
