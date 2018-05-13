package com.itheima.job.homework.day02;

public class Person1 {
	private String name;
	private int age;
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void eat(){
		System.out.println(age+"Ëê"+name+"ÕıÔÚ³Ô·¹");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
