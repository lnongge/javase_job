package com.itheima.homework.job_day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test3 {
	/*aa.txt�ļ���UTF-8���룩�����ַ������������ã���н����
	��ȡaa.txt�ļ��е����ݲ���ӡ������̨��
	����ȡ����������GBK����ĸ�ʽд�뵽cc.txt�ļ���--�ⲽ�϶�������(��Ϊԭʼ�ļ����ݾ���utf-8,����ôҲ�޷�����ת��GBK������)
	*/
	public static void main(String[] args) throws IOException, FileNotFoundException {
		//��ȡaa.txt�����ݲ���ӡ������̨
		FileInputStream fis=new FileInputStream("aa.txt");
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("cc.txt"));
		int len;
		byte[] bys=new byte[1024];
		while((len=fis.read(bys))!=-1){
			//��ȡ������д������̨
			System.out.println(new String(bys,0,len,"utf-8"));
			//��ȡ������д��GBK��ʽд��cc.txt--��Ϊ�ֽ���û��ָ�������ʽ������ת����
			/*�����Ҷ�������utf-8������,Ҫ��GBK��ʽд�뵽cc.txt,�Ѷ�����ת��GBK��д��cc.txt�Ų�������*/
			String s=new String(bys,0,len);
			System.out.println(s);//������
			//osw.write(new String(bys,0,len));
			//osw.flush();
		}
		//�ͷ���Դ
		osw.close();
		fis.close();
		
		
		//method0();
		//�ַ�ת��������ָ������
		//method();
	}

	public static void method0() throws FileNotFoundException, UnsupportedEncodingException, IOException {
		//�ֽ���д��
		FileOutputStream fos =new FileOutputStream("aa.txt");
		String s1="Ӯȡ�׸���";
		byte[] bys=s1.getBytes("utf-8");
		fos.write(bys);
		fos.close();
		//��ȡ
	}

	public static void method() throws FileNotFoundException, IOException, UnsupportedEncodingException {
		InputStreamReader isr=new InputStreamReader(new FileInputStream("aa.txt"));
		
		int len;
		char[] chs=new char[1024];
		//byte[] bys=new byte[1024];
		while((len=isr.read(chs))!=-1){
			String s2=new String(chs,0,len);//string��gbk
			System.out.println(s2);
			//����ַ�����
			byte[] by=s2.getBytes("UTF-8");
			System.out.println(new String(by));
			
		}
		isr.close();
	}
}
