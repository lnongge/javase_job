package com.itheima.job.day02;

public class AnonymousObjiectDemo {
	/*匿名对象的使用
	 * */
	public static void main(String[] args) {
		/*普通方式*/
		Student s= new Student("柳岩",18);
		method(s);
		//匿名对象当参数
		method(new Student("景甜",20));
		
	}
	public static void method(Student s){
		System.out.println("姓名:"+s.getName()+",年龄:"+s.getAge());
	}
}
class Student{//为方便我Student类直接写在这里
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student() {
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