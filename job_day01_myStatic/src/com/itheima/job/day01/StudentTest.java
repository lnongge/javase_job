package com.itheima.job.day01;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student("张三",23,"男");
		s1.show();
		Student s2=new Student();
		s2.setName("李四");
		s2.setAge(32);
		s2.setGender("其他");
		s2.show();
	}
}
