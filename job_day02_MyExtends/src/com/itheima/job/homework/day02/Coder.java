package com.itheima.job.homework.day02;

public class Coder extends Employer {
	
	public Coder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coder(String name, String id, double salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println(getId()+"�ų���Ա"+getName()+"����"+getSalary()+"�鹤������ƴ��д����...");
	}

}
