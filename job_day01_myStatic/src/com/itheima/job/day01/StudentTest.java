package com.itheima.job.day01;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student("����",23,"��");
		s1.show();
		Student s2=new Student();
		s2.setName("����");
		s2.setAge(32);
		s2.setGender("����");
		s2.show();
	}
}
