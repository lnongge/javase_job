package com.itheima.homework.job_day11;

public class Test1 {
	/*��һ�⣺�����������󣬲��ô���ʵ��
	һ����1000�ŵ�ӰƱ,����������������ȡ,����ÿ����ȡ��ʱ��Ϊ3000����,
	Ҫ��:���ö��߳�ģ����Ʊ���̲���ӡʣ���ӰƱ������*/
	public static void main(String[] args) {
		//�����߳�һ
		Thread th1=new Thread(new MyThread(),"����һ");
		th1.start();
		Thread th2=new Thread(new MyThread(),"���ڶ�");
		th2.start();
	}
	
}
