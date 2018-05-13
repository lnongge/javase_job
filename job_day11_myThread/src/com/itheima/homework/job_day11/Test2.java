package com.itheima.homework.job_day11;

public class Test2 {
	/*有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出，利用多线程模拟该过程并将线程的名称打印出来.*/
	public static void main(String[] args) {
		Thread th1=new Thread(new Mythread2(),"麦当劳");
		th1.start();
		Thread th2=new Thread(new Mythread2(),"肯德基");
		th2.start();
		
	}

}
class Mythread2 implements Runnable{
	static int presents=100;
	@Override
	public void run() {
		while(10<presents&&presents<=100){
			synchronized(Mythread2.class){
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					
				}
				System.out.println(Thread.currentThread().getName()+":"+presents--);
			}
		}
		
	}
	
}
