package com.itheima.homework.job_day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {
	/*------------------------------------------------------------------
��һ�⣺�����������󣬲��ô���ʵ��
	��Ŀ��·�����и�questions.txt�ļ��������£�
	5+5
	150-25
	155*155
	2555/5
	Ҫ�󣺶�ȡ���ݼ��������������д�뵽results.txt�ļ���
	����Ϊ��
	5+5=10
	150-25=125
	155*155=24025
	2555/5=511*/
	public static void main(String[] args) throws IOException {
		//ʹ�ø�Ч�ַ�����ȡ����,ʹ�ô�ӡ��д�����results.txt
		BufferedReader br =new BufferedReader(new FileReader("questions.txt"));
		PrintWriter pw=new PrintWriter(new FileWriter("results.txt"),true);
		String line;
		while((line=br.readLine())!=null){
			if(line.matches("[0-9]+\\+[0-9]+")){//�ӷ�����
				String[] strs=line.split("\\+");
				int result=Integer.parseInt(strs[0])+Integer.parseInt(strs[1]);
				//pw.println(strs[0]+"+"+strs[1]+"="+result);
				pw.println(line+"="+result);
			}
			if(line.matches("[0-9]+-[0-9]+")){//��������
				String[] strs=line.split("-");
				int result=Integer.parseInt(strs[0])-Integer.parseInt(strs[1]);
				pw.println(strs[0]+"-"+strs[1]+"="+result);
			}
			if(line.matches("[0-9]+\\*[0-9]+")){//�˷�����
				String[] strs=line.split("\\*");
				int result=Integer.parseInt(strs[0])*Integer.parseInt(strs[1]);
				pw.println(strs[0]+"*"+strs[1]+"="+result);
			}
			if(line.matches("[0-9]+/[0-9]+")){//��������
				String[] strs=line.split("/");
				int result=Integer.parseInt(strs[0])/Integer.parseInt(strs[1]);
				pw.println(strs[0]+"/"+strs[1]+"="+result);
			}
		}
		//�ͷ���Դ
		br.close();
		pw.close();
		
	}
}
