package com.itheima.job.day02;

public class AbstractDemo {
	/*�����๹�췽��*/
	public static void main(String[] args) {
		BasicTeacher bt=new BasicTeacher();
		bt.setName("������");
		bt.setAge(100);
		bt.setGender("��");
		bt.teach();
		JobTeacher jt= new JobTeacher("����",18,"Ů");
		jt.teach();
	}
}
class JobTeacher extends Teacher{

	
	public JobTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobTeacher(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	void teach() {
		// TODO Auto-generated method stub
		System.out.println(this.getAge()+"���"+this.getName()+"��ʦ��javaEE�γ�");
	}
	
}
class BasicTeacher extends Teacher{

	@Override
	void teach() {
		System.out.println(this.getAge()+"���"+this.getName()+"��ʦ��javaSE�γ�");
	}
	
}
abstract class Teacher{
	private String name;
	private int age;
	private String gender;
	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	abstract void teach();
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
	
}