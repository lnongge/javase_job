package com.itheima.job_day11;

public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread3 myTh=new MyThread3();
		Thread th1=new Thread(myTh,"����1" );
		th1.start();
		Thread th2=new Thread(myTh,"����2" );
		th2.start();
		Thread th3=new Thread(myTh,"����3" );
		th3.start();
	}
}

class MyThread3 implements Runnable{
	 int tickets=5;
	// String lock="��1";
	@Override
	public void run() {
		while(true){
			//synchronized(lock){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName()+"ȥ�ϲ���û������...");
				}
				if(tickets>0){
					System.out.println(Thread.currentThread().getName()+":"+(tickets--));
				}
			//}
		}
	}
}