package com.itheima.job.homework.day02;

public abstract class Person {
	private String name;
	private String gender;
	private int age;
	private String nationality;
	public Person() {
		super();
	}
	public Person(String name, String gender, int age, String nationality) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}
	public void eat(){
		System.out.println(name+"正在吃饭...");
	}
	public void sleep(){
		System.out.println(name+"正在睡觉...");
	}
	public abstract void work();
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
