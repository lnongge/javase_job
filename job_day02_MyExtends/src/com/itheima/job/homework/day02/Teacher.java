package com.itheima.job.homework.day02;

public class Teacher extends Person1{
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age) {
		super(name, age);
	}

	public void teach(){
		System.out.println(getAge()+"岁老师"+getName()+"正在上课..");
	}
}
