package com.itheima.job_day10;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EncoderDemo2 {
	/*
	 * �ַ����еı���
	 * */
	public static void main(String[] args) throws IOException {
		//method();
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("e2.txt"),"utf-8");
		String s="Ӯȡ�׸���";
		osw.write(s);
		osw.close();
		
	}

	public static void method() throws IOException, UnsupportedEncodingException {
		FileWriter fw=new FileWriter("e2.txt");
		String str="��н����";
		
		/*System.out.println("gbk���ַ���");
		byte[] bs=str.getBytes();
		for (byte b : bs) {
			System.out.println(b);
		}*/
		
		byte[] bys=str.getBytes("utf-8");
		/*System.out.println("utf-8���ַ���");
		for (byte b : bys) {
			System.out.println(b);
		}*/
		//fw.write(str);
		fw.write(new String(bys));
		fw.close();
		/*������Ҫ��ĥ��:�ַ���Ϊʲô�����?�ļ��ײ�ȫ���ֽ�,�������������ֽ���֮��,����ȡ��д�κ��ļ�,
		 * ����ȡ�����κ��ļ�,����һЩ�ı��ļ���������һЩ����,����ʹ���ֽ�������д,�Ͳ��Ǻܷ���.���Գ�����
		 * �ַ���.��ֱ�Ӱ�������Ҫ���ַ�ת�˳���,�Ѷ���ֽ�ת�����ַ�,�����ǾͿ��Կ���������Ҫ���ַ���.
		 * ���ַ��������дһ���ַ�����ʱ��,�������ֱ�Ӱ��ַ���д���ļ�����?�ļ��е���Щ���ݰ����Ƕ�����,����0��1
		 * �����������д�������ַ���,���ǵײ�ķ�������������,���ǵ㿪...0722
		 * ����дһ���ַ���,��ʵд����һ���ַ�����,�ַ����黹��Ҫ����ת��0��1,��д��
		 * */
	}
}
