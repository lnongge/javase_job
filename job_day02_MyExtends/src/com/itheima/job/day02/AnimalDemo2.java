package com.itheima.job.day02;

public class AnimalDemo2 {
	/*����������й��췽��*/
	public static void main(String[] args) {
		Dog2 d=new Dog2();
		d.barking();
	}
}

class Dog2 extends Animal2{
	public void barking(){
		System.out.println(name);
		System.out.println(age);
	}
	public void eat(){
		
	}
}

abstract class Animal2{
	 String name="����Ȯ";
	 int age=12;
	public Animal2() {
		System.out.println("���ǳ�����Ĺ��췽��");
	}
	public Animal2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	abstract void barking();
	abstract void eat();
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
