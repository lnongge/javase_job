package com.itheima.job_day11;

public class ThreadDemo4 {
	static String lock1="锁1";
	static String lock2="锁2";
	/*死锁出现原因:同步代码块嵌套使用*/
	public static void main(String[] args) {
		//线程1(这里我用匿名内部类的方式创建线程)
		new Thread("王重阳"){
			@Override
			public void run(){
				while(true){
					synchronized(lock1){
						System.out.println(Thread.currentThread().getName()+"拿到锁1");
						synchronized(lock2){
							System.out.println(Thread.currentThread().getName()+"拿到锁2");
						}
					}
				}
			}
		}.start();
		//线程2
		new Thread("周伯通"){
			@Override
			public void run(){
				while(true){
					synchronized(lock2){
						System.out.println(Thread.currentThread().getName()+"拿到锁2");
						synchronized(lock1){
							System.out.println(Thread.currentThread().getName()+"拿到锁1");
						}
					}
				}
			}
		}.start();
	}
}
