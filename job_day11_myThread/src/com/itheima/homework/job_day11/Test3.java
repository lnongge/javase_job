package com.itheima.homework.job_day11;

public class Test3 {
	public static void main(String[] args) {
		/*ͬʱ���������̣߳���ͬ���1-100֮����������֣����ҽ�����������߳����ƴ�ӡ����*/
		Thread th1=new Thread(new MyThread3(),"����");
		th1.start();
		Thread th2=new Thread(new MyThread3(),"ΤС��");
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
					Thread.sleep(10);//����sleep�������������߳�����ִ�е��ĸ���
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
 