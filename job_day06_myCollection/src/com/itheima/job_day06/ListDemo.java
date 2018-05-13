package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		/*void add(int index, element)--增(why没有返回值?因为list可以存储重复的元素,所以一定能存储成功)
		 * E get(index)--查
		 * E removed(intindex)--删
		 * E set(int index, element)--改
		 * */
		List<String> list=new ArrayList<>();
		list.add(0,"hello");
		list.add(0,"word");
		list.add(1,"java");
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.set(0, "android"));
		System.out.println(list);
	}
}
