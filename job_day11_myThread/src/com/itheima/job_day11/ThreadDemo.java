package com.itheima.job_day11;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread th1=new MyThread();
		th1.setName("��������");//���߳�1��������
		th1.start();
		MyThread th2=new MyThread("������");//ͨ�����췽�����߳�2��������
		th2.start();
		/*MyThread th2=new MyThread();
		th2.setName("������");
		th2.start();*/
		for (int i = 0; i < 5; i++) {//����main������,Ҳ��main�߳���,���th1,th2��cpu,���б��⹲��3���߳�
			System.out.println("�����"+i);
		}
	}
}
