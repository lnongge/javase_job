package com.itheima.job.homework_day03;

public class Outer {
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("HelloWorld");
			}
		};
	}
}
