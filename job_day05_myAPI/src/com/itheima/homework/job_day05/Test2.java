package com.itheima.homework.job_day05;

import java.util.Calendar;

public class Test2 {
/*�ڶ��⣺�����������󣬲��ô���ʵ��
	Ҫ��:����Calendar��ķ����жϵ�ǰ�������껹��ƽ��
	��ʾ:
	����:������29��
	��ʾ������������Ϊ3��1��,Ȼ����1����2�µ�,���2�µ��Ƕ�����*/
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(c.get(Calendar.YEAR), 2,1);
		//c.set(Calendar.DAY_OF_MONTH,0);
		c.add(Calendar.DAY_OF_MONTH,-1);
		int day=c.get(Calendar.DAY_OF_MONTH);
		/*System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));*/
	
		if(day==29){
			System.out.println(c.get(Calendar.YEAR)+"��������");
		}
		if(day==28){
			System.out.println(c.get(Calendar.YEAR)+"����ƽ��");
		}
	}
}
