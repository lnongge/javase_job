package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test5 {
	public static void main(String[] args) {
		/*江攀遇到的问题*/
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
		//for循环模拟迭代器
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
