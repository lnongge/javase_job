package com.itheima.job.homework.day02;

public class Student extends Person {
	private String school;
	private String stuNumber;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String gender, int age, String nationality,String school,String stuNumber) {
		super(name, gender, age, nationality);
		this.school =school;
		this.stuNumber=stuNumber;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the stuNumber
	 */
	public String getStuNumber() {
		return stuNumber;
	}

	/**
	 * @param stuNumber the stuNumber to set
	 */
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	
	@Override
	public void work(){
		System.out.println(getAge()+"岁的"+getNationality()+school+getGender()+"学生"+getName()+"的工作是学习!");
	}
}
