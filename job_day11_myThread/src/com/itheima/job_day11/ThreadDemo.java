package com.itheima.job_day11;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread th1=new MyThread();
		th1.setName("东方不败");//给线程1设置名字
		th1.start();
		MyThread th2=new MyThread("任我行");//通过构造方法给线程2设置名字
		th2.start();
		/*MyThread th2=new MyThread();
		th2.setName("任我行");
		th2.start();*/
		for (int i = 0; i < 5; i++) {//这是main方法的,也在main线程里,会跟th1,th2抢cpu,所有本题共有3个线程
			System.out.println("令狐冲"+i);
		}
	}
}
