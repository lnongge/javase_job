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
		System.out.println(getId()+"����Ŀ����"+getName()+"����"+getSalary()+"�鹤��,Ϊ��"+bonus+"�齱������ƴ�����ų���Աд����...");
		
	}
	
}
