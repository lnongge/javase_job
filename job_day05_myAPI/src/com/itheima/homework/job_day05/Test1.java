package com.itheima.homework.job_day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * ��һ�⣺�����������󣬲��ô���ʵ��
	1.�Ӽ���¼��һ�������ַ���,��ʽΪ xxxx-xx-xx,������˵ĳ�������
	2.�����˳������ڵ���ǰ�����������ĺ���ֵ���������˻��˶�����
 * */
public class Test1 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("�������������(��ʽΪxxxx-xx-xx):");
			String birthday=sc.nextLine();
			if(birthday.matches("\\d{4}-\\d{2}-\\d{2}")){
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				Date birDate=sdf.parse(birthday);
				Date curDate=new Date();
				long srcD=birDate.getTime();
				long destD=curDate.getTime();
				long result=(destD-srcD)/1000/60/60/24;
				System.out.println("���������"+(result)+"��");
				System.out.println("(һ�갴365��,һ����30����)����"+(result/365)+"��"+(result%365/30)+"��"+(result%365%30)+"��");
				return;
			}else{
				System.out.println("����������ڸ�ʽ����,����������!");
			}
		}
		
	}
}
