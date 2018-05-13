package com.itheima.job_day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesDemo {
	/*
	 * void load(Reader reader) //��----- void load(InputStream
	 * inStream)���������ж�ȡ�����б�����Ԫ�ضԣ���
	 * 
	 * //д void list(PrintWriter out)------- void list(PrintStream out)
	 * �������б������ָ����������� void store(Writer writer, String comments)
	 * 
	 */
	public static void main(String[] args) throws IOException {
		 method1();

		 method2();
		
		
		
		

	}

	public static void method2() throws FileNotFoundException, IOException {
		// p.txt-->Properties: �� ����:load(�ֽ�/�ַ�������)
		FileInputStream fis = new FileInputStream("p.txt");// �ֽ������
		// FileReader fr=new FileReader("p.txt");
		Properties p2 = new Properties();
		p2.load(fis);
		fis.close();
		System.out.println(p2);
	}

	public static void method1() throws IOException {
		// Properties-->p.txt: д
		Properties prop = new Properties();
		prop.put("�Ƿ�", "����ʮ����");
		prop.put("����", "������");
		prop.put("����", "��ڤ��");
		// PrintWriter pw=new PrintWriter("p.txt");
		PrintStream ps = new PrintStream("p.txt");// �ֽڴ�ӡ�����
		// PrintStream ps=new Printtream(new
		// FileOutputStream("p.txt"));//�ֽڴ�ӡ�����
		// prop.list(ps);
		prop.store(ps, null);
		ps.flush();// Ҳ��Ҫˢ�»��������
		ps.close();
	}
}
