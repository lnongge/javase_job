package com.itheima.job_day09;

import java.io.File;

public class FileDemo5 {
	/*1���ָ��Ŀ¼�µ�����.java�ļ�(������Ŀ¼�µ�)
	 *2ɾ��ָ��Ŀ¼�µ������ļ�(������Ŀ¼���Լ�)
	 * */
	
	public static void main(String[] args) {
		File f=new File("src");
		File f1=new File("a.txt");
		printFile(f);
		
		//ɾ���Զ�Ŀ¼�µ������ļ�
		File f2=new File("D:\\develop\\Java\\eclipse\\workspace_javajob");
		deleteFile(f2);
	}

	private static void deleteFile(File f2) {
		//���f2���ļ���,ɾ����Ŀ¼
		if(f2.isDirectory()){
			File[] files=f2.listFiles();
			for (File file : files) {
				if(file.isFile()){//���ļ�ֱ��ɾ��
					file.delete();
				}else{//���ļ���,�ݹ�ɾ��
					deleteFile(file);
				}
			}
		}
		//ɾ���Լ�
		f2.delete();
	}

	private static void printFile(File f) {
		//���û�����if,�������f��һ���ļ�ʱ,����File[] files=f.listFiles();�᷵��null
		//,����һ��foreach�����ᱨ��ָ���쳣
		if(f.isDirectory()){//�������f����һ���ļ���
			File[] files=f.listFiles();
			for (File file : files) {
				if(file.isFile()){//��һ���ļ�
					if(file.getName().endsWith(".java"))
						System.out.println(file.getName());//����ļ���
				}else{//��һ����Ŀ¼
					printFile(file);//�ݹ������Ŀ¼�µ�����.java�ļ�
				}
			}
		}else{//f��һ���ļ�,�ļ���û����Ŀ¼��
			System.out.println("·������");
		}
	}
}
