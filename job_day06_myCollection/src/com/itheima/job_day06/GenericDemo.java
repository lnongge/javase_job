package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
	/*����:
	 * �ŵ�:������ʱ�����Ĵ�����ǰ������ʱ
	 * */
	public static void main(String[] args) {
//		Collection c=new ArrayList<>();//ûд����
		Collection<Student> c=new ArrayList<>();
		Student s1=new Student("����",18);
		Student s2=new Student("����",20);
		c.add(s1);
		c.add(s2);
//		Iterator it=c.iterator();//ûд����
		Iterator<Student> it =c.iterator();
		while(it.hasNext()){
//			String str=(String)it.next();
//			System.out.println(str);//ûд����ֻ�е��������ʱ�ű�ClassCastException(����ת���쳣)
			
			//String str=(String)it.next();//�ӷ���֮��,������޷�ͨ������
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