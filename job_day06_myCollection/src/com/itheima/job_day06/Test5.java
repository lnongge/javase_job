package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test5 {
	public static void main(String[] args) {
		/*��������������*/
		ArrayList<String> list=new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("123");
		list.add("aoi");
		list.add("bbc");
		ListIterator<String> it=list.listIterator();
	
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
			if(s.equals("123")){
				it.add("456");
				it.previous();
			}
		}
		//forѭ��ģ�������
		/*for (int i = 0; i < list.size(); i++) {
			String s=it.next();
			
			if(s.equals("123")){
				it.add("456");
				it.previous();
			}
		}*/
		System.out.println(list);
		
	}
}
