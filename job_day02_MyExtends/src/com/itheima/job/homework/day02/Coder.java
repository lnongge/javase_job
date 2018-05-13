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
		System.out.println(getId()+"号程序员"+getName()+"拿着"+getSalary()+"块工资正在拼命写代码...");
	}

}
