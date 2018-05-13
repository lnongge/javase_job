package com.itheima.job.day01;

import java.util.Arrays;

public class Student1Test {
	/*
	 * 1 先进内存的不能调用后进内存的
	 * 工具类:1构造被私有 2所有成员被static修饰
	 * 如:Arrays类--包含数组的大部分操作(遍历,排序等)
	 * 		构造方法被私有用来防止此类被创建对象
	 * */
	public static void main(String[] args) {
		print();
		Student1Test t=new Student1Test();
		t.print();
		Student1 s=new Student1();
		s.name="zhangsan";
		s.age=18;
		System.out.println("-----------");
		int[] arr=null;
		System.out.println(Arrays.toString(arr));
	}

	public static void print() {
		System.out.println("hello");
	}
	
}
