package com.itheima.job_day11;

public class ThreadDemo2 {
	/*ʵ���̵߳ĵڶ��ַ���*/
	public static void main(String[] args) {
		Thread th1=new Thread(new MyThread2(),"ŷ����");
		th1.start();
		Thread th2=new Thread(new MyThread2(),"���߹�");
		th2.start();
	}
}
class MyThread2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			//��ӡ�߳�������i
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
