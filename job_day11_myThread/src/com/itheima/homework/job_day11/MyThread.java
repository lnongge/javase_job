package com.itheima.homework.job_day11;

public class MyThread implements Runnable {
	static int tickets=1000;
	@Override
	public void run() {
		while(true){
			synchronized (MyThread.class) {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + ":" + tickets--);
				}
			}
		}
		
	}

	
}
