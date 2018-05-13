package com.itheima.job_day13;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printPer(){
		System.out.println(name+"==="+age);
	}
	public int functions(int num){
		
		return num+10;
	}
	private int numAdd(int num){
		
		return num+10;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}
	
}
