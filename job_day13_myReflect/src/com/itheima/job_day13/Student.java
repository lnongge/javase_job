package com.itheima.job_day13;

public class Student {
	private String name;
	int age;
	public Student() {
	}
	public Student(String name, int age) {
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}
	
}
