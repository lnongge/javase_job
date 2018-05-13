package com.itheima.job_day11;

public class MyThread extends Thread{
	public MyThread() {
	}
	public MyThread(String name) {
		super(name);//如果要通过构造方法给线程设置名字,必须生成有参构造方法
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()+":"+i);
		}
	}
}
