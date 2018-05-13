package com.itheima.job_day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MapAndListDemo {
	/*Map嵌套List*/
	public static void main(String[] args) {
		//创建Map集合
		HashMap<Character,List<Student>> hm=new HashMap<>();
		//创建Map的值元素
		List<Student> list=new  ArrayList<>();
		List<Student> list2=new  ArrayList<>();
		list.add(new Student("汤唯",18));
		list.add(new Student("关之琳",28));
		list2.add(new Student("赵雅芝",38));
		list2.add(new Student("叶童",35));
		//添加到map
		hm.put('a', list);
		hm.put('b', list2);
		
		//遍历集合
		Set<Character> keySet = hm.keySet();
		for (Character ch : keySet) {
			System.out.println(ch);
			List<Student> l1=hm.get(ch);
			for (Student stu : l1) {
				System.out.println(stu.getName()+","+stu.getAge());
			}
		}
	}
}
