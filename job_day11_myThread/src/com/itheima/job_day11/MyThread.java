package com.itheima.job_day11;

public class MyThread extends Thread{
	public MyThread() {
	}
	public MyThread(String name) {
		super(name);//���Ҫͨ�����췽�����߳���������,���������вι��췽��
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()+":"+i);
		}
	}
}
