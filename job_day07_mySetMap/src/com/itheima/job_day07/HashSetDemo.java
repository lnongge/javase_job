package com.itheima.job_day07;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//创建集合
		HashSet<Student> hs=new HashSet<>();
		//创建集合元素
		Student s1=new Student("刘备",40);
		Student s2=new Student("关羽",35);
		Student s3=new Student("刘备",40);
		//把元素添加到集合
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		//遍历set集合
		for (Student student : hs) {
			System.out.println(student);
		}
	}
}
