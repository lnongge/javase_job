package com.itheima.job_day11;

public class ThreadDemo5 {
	/*�ȴ����ѻ���
	 * 	����:����2���߳�һ����ӡ"����ʮ����",һ����ӡ"��󡹦",Ҫ��:�����ӡ
	 * ����:��wait()��notify()���.
	 * ע:������������������Object��
	 * */
	public static void main(String[] args) {
		final Printer p = new Printer();
		//��1���߳�
		new Thread("���߹�") {
			@Override
			public void run() {
				while (true) {
					try {
						p.thread1();//java�оֲ��ڲ������õ��ֲ�����,��ֲ�������Ҫ��final����
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		//�ڶ����߳�
		new Thread("ŷ����") {
			@Override
			public void run() {
				while (true) {
					try {
						p.thread2();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}

class Printer {
	int num = 1;// 1
	public void thread1() throws Exception {
		synchronized (this) {
			if (num != 1) {// false
				wait(); // ��ǰ�̵߳ȴ�
			}
			System.out.println(Thread.currentThread().getName()+":����ʮ����");
			num = 2;
			notify(); // �������һ���ȴ����߳�
		}
	}
	public void thread2() throws Exception {
		synchronized (this) {
			if (num != 2) {// false
				wait(); // ��ǰ�̵߳ȴ�
			}
			System.out.println(Thread.currentThread().getName()+":��󡹦");
			num = 1;
			notify();
		}
	}
}

