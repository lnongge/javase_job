package com.itheima.homework.job_day11;

public class Test3 {
	public static void main(String[] args) {
		/*同时开启两个线程，共同输出1-100之间的所有数字，并且将输出奇数的线程名称打印出来*/
		Thread th1=new Thread(new MyThread3(),"康熙");
		th1.start();
		Thread th2=new Thread(new MyThread3(),"韦小宝");
		th2.start();
	}
}
class MyThread3 implements Runnable{
	static int num=1;
	@Override
	public void run() {
		while(0<num&&num<100){
			synchronized(MyThread3.class){
				try {
					Thread.sleep(10);//这里sleep的作用是增加线程评均执行到的概率
				} catch (Exception e) {
				}
				if(num%2!=0){
					System.out.println(Thread.currentThread().getName()+":"+num++);
				}else{
					System.out.println(num++);
				}
			}
		}
	}
}
 