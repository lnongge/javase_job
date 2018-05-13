package com.itheima.job_day11;

public class ThreadDemo5 {
	/*等待唤醒机制
	 * 	需求:我有2个线程一个打印"降龙十八掌",一个打印"蛤蟆功",要求:交替打印
	 * 分析:用wait()和notify()配合.
	 * 注:这两个方法都是来自Object类
	 * */
	public static void main(String[] args) {
		final Printer p = new Printer();
		//第1个线程
		new Thread("洪七公") {
			@Override
			public void run() {
				while (true) {
					try {
						p.thread1();//java中局部内部类里用到局部变量,则局部变量都要加final修饰
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		//第二个线程
		new Thread("欧阳锋") {
			@Override
			public void run() {
				while (true) {
					try {
						p.thread2();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}

class Printer {
	int num = 1;// 1
	public void thread1() throws Exception {
		synchronized (this) {
			if (num != 1) {// false
				wait(); // 当前线程等待
			}
			System.out.println(Thread.currentThread().getName()+":降龙十八掌");
			num = 2;
			notify(); // 随机唤醒一个等待的线程
		}
	}
	public void thread2() throws Exception {
		synchronized (this) {
			if (num != 2) {// false
				wait(); // 当前线程等待
			}
			System.out.println(Thread.currentThread().getName()+":蛤蟆功");
			num = 1;
			notify();
		}
	}
}

