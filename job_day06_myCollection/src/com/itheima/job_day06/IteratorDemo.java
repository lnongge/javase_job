package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	/*并发修改异常ConcurrentModificationException
	 * 迭代器可以看成是集合的一个副本,用迭代器遍历时当迭代器里的元素与集合里的元素不一样时就会报并发修改异常
	 * 解决方法:
	 * 1用迭代器迭代时,用迭代器去修改集合里的元素
	 * 2用for循环去遍历集合---
	 * */
	
	public static void main(String[] args) {
		//Collection c=new ArrayList<>();
		List<String> c=new ArrayList<>();
		c.add("hello");
		c.add("word");
		c.add("java");
		Iterator<String> it=c.iterator();
		//ListIterator it=c.listIterator();
		while(it.hasNext()){
			if(it.next().equals("java"))
				//c.add("android");报错
				c.set(1, "android");//不报错
				//c.remove(1);报错
				//it.add("android");
		}
		System.out.println(c);
	}
}
