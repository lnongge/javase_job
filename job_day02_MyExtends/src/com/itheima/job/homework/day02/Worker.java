package com.itheima.job.homework.day02;
	
public class Worker extends Person {
	private String unit;
	private int workAge;
	
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, String gender, int age, String nationality,String unit,int workAge) {
		super(name, gender, age, nationality);
		this.unit=unit;
		this.workAge=workAge;
	}

	@Override
	public void work() {
		System.out.println(getAge()+"���"+getNationality()+unit+getGender()+"����"+getName()+"�Ĺ����ǸǷ���!");
	}

}
