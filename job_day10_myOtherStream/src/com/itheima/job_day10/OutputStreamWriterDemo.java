package com.itheima.job_day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileManager.Location;

public class OutputStreamWriterDemo {
	/*����:��ȡ��Ŀ��Ŀ¼�µ�һ��SystemInOutDemo.java�ļ�,�������������*/
	public static void main(String[] args) throws IOException {
		//method();
		/*
		 * ���ڱ�׼�������һ���ֽ������������ֻ������ֽڻ����ֽ����飬�������Ƕ�ȡ�������������ַ��������������������Ҫת�����ֽ�����
		 * ����Ҫ��ͨ����׼���������ַ������ѱ�׼�����ת����һ���ַ���������ɣ�OutputStreamWriter
		 */
		BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		
		
	}

	public static void method() throws FileNotFoundException, IOException {
		//���ļ��ж�ȡ����---�������ֽ���Ҳ�������ַ���,��ѡ��Ч��
		//��ΪҪ��ӡ��������--��ѡ��׼�����
		BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
		OutputStream out=System.out;
		String line;
		while((line=br.readLine())!=null){
			//�����������
			out.write(line.getBytes());//ע��׼�����ֻ��д�ֽں��ֽ�����.�������Ҷ�ȡ�������ַ���,զ��?���ַ���ת���ֽ�����
			out.write("\r\n".getBytes());//����Ҫ�ֶ�д�뻻��,��ҲҪת�ֽ�����
		}
	}
}
