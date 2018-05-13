package com.itheima.job_day11;

public class ThreadDemo2 {
	/*实现线程的第二种方法*/
	public static void main(String[] args) {
		Thread th1=new Thread(new MyThread2(),"欧阳锋");
		th1.start();
		Thread th2=new Thread(new MyThread2(),"洪七公");
		th2.start();
	}
}
class MyThread2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			//打印线程姓名和i
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
