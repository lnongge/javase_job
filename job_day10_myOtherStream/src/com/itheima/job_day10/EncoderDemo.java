package com.itheima.job_day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncoderDemo {
	/*java���ַ�����Ĭ�ϱ���
	 * 1.ʹ���ֽ������,��e.txtдһ���ַ���.Ȼ���e.txt�ĳ�utf-8����,��дһ��--e.txt��������
	 * 
	 * 2.��
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		//method();
		/*��*/
		FileInputStream fis=new FileInputStream("e.txt");
		byte[] bys=new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1){
			//System.out.println(new String(bys,0,len));
			//������,��Ϊ����e.txt��utf-8,����ֱ������ַ���,�ַ���Ĭ����gbk,��һ�¹�����
			//��ô���?�ڹ����ַ�����ʱ�����ֽ�--api�п�String����String(byte[],int start,int len, String charsetName)
			
			System.out.println(new String(bys,0,len,"utf-8"));
		}
		
	}

	public static void method() throws FileNotFoundException, UnsupportedEncodingException, IOException {
		/*д*/
		String s="�ճ�����,Ψ�Ҳ���";
		//���������ֽ������
		FileOutputStream fos=new FileOutputStream("e.txt");
		//��Ϊ�ֽ������ֻ��д�ֽ�������ֽ�,����ֱ��д�ַ���,��������Ҫ���ַ������ԭ��
		//byte[] bys=s.getBytes();//�ַ���ת���ֽ�����,Ĭ��ʹ��GBK����
		byte[] bys=s.getBytes("utf-8");
		
		fos.write(bys);
		fos.close();
	}
}
