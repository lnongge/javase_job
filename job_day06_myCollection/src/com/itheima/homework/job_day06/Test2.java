package com.itheima.homework.job_day06;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test2 {
	/*�ڶ��⣺�����������󣬲��ô���ʵ��
	1.����List���ϣ��������ַ���
		"dfaef"
		"def"
		"deaff"
		"dfasef"
		"def"
		"def"
	2.���õ�������������Ԫ�ز�ɾ���������ַ���"def"
	3.�������Ԫ��*/
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("dfaef");
		list.add("def");
		list.add("deaff");
		list.add("dfasef");
		list.add("def");
		list.add("def");
		ListIterator<String> it=list.listIterator();
		System.out.println("ԭ�����е�Ԫ��Ϊ:"+list);
		while(it.hasNext()){
			String s=it.next();
			if(s.equals("def")){
				it.remove();
				continue;
			}
			System.out.println(s);
		}
		System.out.println("ɾ��def�󼯺��е�Ԫ��Ϊ"+list);
		
	}
}
