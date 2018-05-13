package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
	/*泛型:
	 * 优点:把运行时发生的错误提前到编译时
	 * */
	public static void main(String[] args) {
//		Collection c=new ArrayList<>();//没写泛型
		Collection<Student> c=new ArrayList<>();
		Student s1=new Student("张三",18);
		Student s2=new Student("李四",20);
		c.add(s1);
		c.add(s2);
//		Iterator it=c.iterator();//没写泛型
		Iterator<Student> it =c.iterator();
		while(it.hasNext()){
//			String str=(String)it.next();
//			System.out.println(str);//没写泛型只有到运行这句时才报ClassCastException(类型转换异常)
			
			//String str=(String)it.next();//加泛型之后,我这句无法通过编译
			Student s=it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
	}
}
class Student{
	private String name;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
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
	
}