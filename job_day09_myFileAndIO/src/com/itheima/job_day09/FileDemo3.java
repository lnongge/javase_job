package com.itheima.job_day09;

import java.io.File;
import java.util.Date;

public class FileDemo3 {
	/*File�Ļ�ȡ����*/
	public static void main(String[] args) {
		/*
		 * File getAbsoluteFile()  ����File�������ʽ���ص�ǰFile��������ָ��ľ���·��
		 * String getAbsolutePath() : ��String��ʽ����File������ָ��ľ���·��
		*/
		File f1=new File("a.txt");
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getAbsoluteFile());
		
		/*
		 * String getParent() :���ַ�����ʽ����file�������һ��·��ǰ�����е�·��
		 * File getParentFile() : ��ȡ�������һ��·��ǰ�����е�·��,ע�ⷵ��ֵΪFile
		 */
		System.out.println(f1.getParentFile());
		System.out.println(f1.getParent());//����null
		File f2=new File("a\\b\\c");
		System.out.println(f2.getParentFile());
		System.out.println(f2.getParent());//����a\b
		/*
		 * String getName() : ��ȡ·�������һ������,����·�����ַ�����ʽ(�ļ��ļ��ж����Ի�ȡ)
		 */
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		/*
		 * long lastModified() : �Ժ���ֵ����ʽ��������޸�ʱ��
		 */
		Long l1=f1.lastModified();
		System.out.println(l1);
		System.out.println(new Date(l1).toLocaleString());
		
		/*
		 * long length() : �����ļ����ֽ���
		 */
		System.out.println(f1.length());
		System.out.println(f2.length());//0,��Ϊf2�����ļ������ļ���
		/*
		 * String getPath() : ���ش���File����ʱ����·��
		 */
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		
		//ɾ���ļ�
	}
}
