package com.itheima.job.day02;

public class AnonymousObjiectDemo {
	/*���������ʹ��
	 * */
	public static void main(String[] args) {
		/*��ͨ��ʽ*/
		Student s= new Student("����",18);
		method(s);
		//�������󵱲���
		method(new Student("����",20));
		
	}
	public static void method(Student s){
		System.out.println("����:"+s.getName()+",����:"+s.getAge());
	}
}
class Student{//Ϊ������Student��ֱ��д������
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