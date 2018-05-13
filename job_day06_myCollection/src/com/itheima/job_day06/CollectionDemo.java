package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		//add
		System.out.println(c.add("hello"));
		System.out.println(c.add("world"));
		//clear
		//c.clear();
		//contains
		 System.out.println(c.contains("hello"));
		 System.out.println(c.contains("java"));
		//isEmpty
		System.out.println(c.isEmpty());
		//remove(object)
		//c.remove("hello");
		//int size()
		System.out.println(c.size());
		//Object[] toArray()
		Object[] objs=c.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
	}
}
