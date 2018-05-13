package com.itheima.homework.job_day13;

public class Person {
	private String  name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public void show1(){
		System.out.println("黑马程序员");
	}
	public String show2(){
		return "传智博客";
	}
	public void show3(String name,int age){
		System.out.println(name+":"+age);
	}
	public String show4(String name){
		return name;
	}
	
}
