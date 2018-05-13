package com.itheima.homework.job_day09;

import java.io.File;
import java.util.Scanner;

public class Test1 {
	/*��һ�⣺�����������󣬲��ô���ʵ��
	�Ӽ��̽���һ���ļ���·��,ͳ�Ƹ��ļ��д�С
	Ҫ��
	1.����public static File getFile()�������Լ���¼����ַ��������жϣ�
	�ļ�·�������ڻ���¼��Ĳ����ļ���·���������¼��ֱ��¼������ļ���·���������ء�
	2.����public static long getLength(File file)����¼�ļ��д�С
	3.main�����е����������������������ļ��д�С
	*/
	public static void main(String[] args) {
		File f=getFile();
		
		long fileSize=getLength(f);
		System.out.println("�ļ���С��:"+fileSize);
		
	}

	private static long getLength(File f) {
		int sumSize=0;
		if(f.isDirectory()){//f���ļ���
			File[] files=f.listFiles();
			for (File file : files) {
				if(file.isFile()){
					sumSize+=file.length();
				}else if(file.isDirectory()){
					sumSize+=getLength(file);
				}
			}
		}else{//f���ļ�,��f�Ĵ�С֮��ӵ�sumSize---������������esle�ɲ�Ҫ,��Ϊ����getLength()֮ǰ�϶�����getFile() ��getFile()�������ж�
			//(������������ұ������ܱȽ�ǿ��,�ȿ��Լ����ļ��д�СҲ���Լ����ļ���С)
			
			sumSize+=f.length();
		}
		
		
		return sumSize;
	}

	public static File getFile() {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("�������ļ���·��:");
			String url=sc.nextLine();
			File f=new File(url);
			if(f.isDirectory()||f.isFile()){//��������ļ�·��
				if(f.exists()){//�ļ�����,���ظ��ļ�
					return f;
				}else{//�ļ��в�����
					System.out.println("�ļ��в�����,����������!");
				}
				
			}else{//�����·�������ļ�·��
				System.out.println("�������·����ʽ����,����������!");
			}
		}
	}
}
