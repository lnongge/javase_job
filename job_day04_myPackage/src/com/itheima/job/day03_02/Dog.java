package com.itheima.job.day03_02;

public  class Dog {
	public void catchMouse(){
		System.out.println("dog");
	}
}
class Cat{//这里的cat权限是default,无法用public修饰,要用public修饰只能单独写在一个.java文件中
	public void catchMouse(){
		System.out.println("cat");
	}
}