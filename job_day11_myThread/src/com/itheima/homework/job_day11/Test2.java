package com.itheima.homework.job_day11;

public class Test2 {
	/*��100����Ʒ,����ͬʱ���ͣ���ʣ�µ���ƷС��10�ݵ�ʱ�������ͳ������ö��߳�ģ��ù��̲����̵߳����ƴ�ӡ����.*/
	public static void main(String[] args) {
		Thread th1=new Thread(new Mythread2(),"����");
		th1.start();
		Thread th2=new Thread(new Mythread2(),"�ϵ»�");
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
