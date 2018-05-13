package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIteratorDemo {
	//集合的遍历方法:迭代器--不是所有的集合都能用for循环来遍历的,不能用for循环的集合可以用迭代器
	public static void main(String[] args) {
		Collection c=new ArrayList<>();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
