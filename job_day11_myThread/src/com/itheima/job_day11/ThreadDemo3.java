package com.itheima.job_day11;

public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread3 myTh=new MyThread3();
		Thread th1=new Thread(myTh,"窗口1" );
		th1.start();
		Thread th2=new Thread(myTh,"窗口2" );
		th2.start();
		Thread th3=new Thread(myTh,"窗口3" );
		th3.start();
	}
}

class MyThread3 implements Runnable{
	 int tickets=5;
	// String lock="锁1";
	@Override
	public void run() {
		while(true){
			//synchronized(lock){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName()+"去上厕所没回来了...");
				}
				if(tickets>0){
					System.out.println(Thread.currentThread().getName()+":"+(tickets--));
				}
			//}
		}
	}
}