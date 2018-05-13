package com.itheima.job_day05;

public class Test {
	/*
	 * 课堂测试--下面程序输出结果是?
	 * */
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		System.out.println(p1.equals(p2));//false
		
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p1.equals(p1.toString()));//false
		
		System.out.println(p1.toString().equals(p1.toString()));
	}
}
class Person{
	
}