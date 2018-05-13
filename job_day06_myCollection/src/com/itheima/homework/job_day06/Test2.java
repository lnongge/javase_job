package com.itheima.homework.job_day06;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test2 {
	/*第二题：分析以下需求，并用代码实现
	1.定义List集合，存入多个字符串
		"dfaef"
		"def"
		"deaff"
		"dfasef"
		"def"
		"def"
	2.利用迭代器遍历集合元素并删除集合中字符串"def"
	3.输出集合元素*/
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("dfaef");
		list.add("def");
		list.add("deaff");
		list.add("dfasef");
		list.add("def");
		list.add("def");
		ListIterator<String> it=list.listIterator();
		System.out.println("原集合中的元素为:"+list);
		while(it.hasNext()){
			String s=it.next();
			if(s.equals("def")){
				it.remove();
				continue;
			}
			System.out.println(s);
		}
		System.out.println("删除def后集合中的元素为"+list);
		
	}
}
