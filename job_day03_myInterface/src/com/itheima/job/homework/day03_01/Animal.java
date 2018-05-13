package com.itheima.job.homework.day03_01;

public abstract class Animal {
	private int age;
	private String color;
	public Animal() {
		super();
	}
	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}
	public abstract void eat(String food);
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
