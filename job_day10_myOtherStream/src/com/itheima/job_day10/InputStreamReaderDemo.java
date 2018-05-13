package com.itheima.job_day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class InputStreamReaderDemo {
	/*(�ɷ�����)
	 * �Ӽ��̶�ȡһ������,д�뵽��Ŀ¼�µ�a.txt�ļ�
	 * ������ת����:OutputStreamWriter 
	 * */
	public static void main(String[] args) throws IOException {
		//method();

		//method2();
		//��չ:�Ӽ��̶�ȡһ������,д������̨
		System.out.println("����������:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));//---���������ĿҪ��
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//(3)--���Լ�����չ:������������,�ڿ���̨�ϴ�ӡ�������
		String line;
		while((line=br.readLine())!=null){
			System.out.print("���������:");//(3)
			bw.write(line);//��3����д���ݵ�����̨,��TMD����֮����System.out���
			//bw.newLine();
			bw.flush();
			System.out.println("���������:"+line);
			System.out.println("����������:");
		}
		bw.close();
		br.close();
		
		//������δ���,��TMD�Ϳ�����������δ���ʵ��
		/*Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("����������:");
			String line=sc.nextLine();
			System.out.println("���������:"+line);
		}*/
	}

	public static void method2() throws IOException {
		//��ת��������----��������
		System.out.println("����������:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));//---���������ĿҪ��
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	public static void method() throws IOException {
		//����ת����ʵ��---ԭʼ����
		System.out.println("����������:");
		InputStream in=System.in;
		
		FileWriter fw=new FileWriter("a.txt");
		
		int len;
		byte[] bys=new byte[1024];
		while((len=in.read(bys))!=-1){
			fw.write(new String(bys,0,len));
			fw.flush();
		}
		in.close();
		fw.close();
	}
}
