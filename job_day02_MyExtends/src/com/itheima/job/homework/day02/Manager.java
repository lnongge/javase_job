package com.itheima.job.homework.day02;

public class Manager extends Employer {
	private byte bonus;
	
	
	public Manager() {
		super();
	}


	public Manager(String name, String id, double salary,byte bonus) {
		super(name, id, salary);
		this.bonus=bonus;
	}


	@Override
	public void work() {
		System.out.println(getId()+"号项目经理"+getName()+"拿着"+getSalary()+"块工资,为了"+bonus+"块奖金正在拼命盯着程序员写代码...");
		
	}
	
}
