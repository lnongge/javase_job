package com.itheima.homework.job_day11;

public class Test1 {
	/*第一题：分析以下需求，并用代码实现
	一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
	要求:请用多线程模拟卖票过程并打印剩余电影票的数量*/
	public static void main(String[] args) {
		//创建线程一
		Thread th1=new Thread(new MyThread(),"窗口一");
		th1.start();
		Thread th2=new Thread(new MyThread(),"窗口二");
		th2.start();
	}
	
}
