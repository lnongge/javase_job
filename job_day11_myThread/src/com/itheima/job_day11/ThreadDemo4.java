package com.itheima.job_day11;

public class ThreadDemo4 {
	static String lock1="��1";
	static String lock2="��2";
	/*��������ԭ��:ͬ�������Ƕ��ʹ��*/
	public static void main(String[] args) {
		//�߳�1(�������������ڲ���ķ�ʽ�����߳�)
		new Thread("������"){
			@Override
			public void run(){
				while(true){
					synchronized(lock1){
						System.out.println(Thread.currentThread().getName()+"�õ���1");
						synchronized(lock2){
							System.out.println(Thread.currentThread().getName()+"�õ���2");
						}
					}
				}
			}
		}.start();
		//�߳�2
		new Thread("�ܲ�ͨ"){
			@Override
			public void run(){
				while(true){
					synchronized(lock2){
						System.out.println(Thread.currentThread().getName()+"�õ���2");
						synchronized(lock1){
							System.out.println(Thread.currentThread().getName()+"�õ���1");
						}
					}
				}
			}
		}.start();
	}
}
