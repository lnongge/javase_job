package com.itheima.job.homework_day03;

public class Test2 {
	/*
�ڶ��⣺�����������󣬲��ô���ʵ��
	���������ʼǱ��࣬ʵ�ֱʼǱ�ʹ��USB��ꡢUSB����
	1.����USB�ӿ�:
		��������open()
		�رչ���close()
	2.���������Mouse:
		Ҫ����USB�ӿڣ���дopen��close��������ʽ���մ�ӡЧ��
	3.���������Keyboard:
		Ҫ����USB�ӿڣ���дopen��close��������ʽ���մ�ӡЧ��
	4.����ʼǱ���Computer:
		��������start
		�ػ�����stop
		����ʹ��USB�豸�Ĺ��ܣ�useUSB(����)
		Ҫ��:����ʹ�����Ҳ��ʹ�ü���,ʹ��USB���ܵ��ÿ����͹رչ���	
	5.���������:
		�������Զ���,���ε��ÿ���������ʹ��USB�豸��ꡢʹ��USB�豸���̡��ػ�����
		��ӡЧ������:
			����
			��������USB
			�Ͽ�����USB
			���Ӽ��̵�USB
			�Ͽ����̵�USB
			�ػ�*/
	public static void main(String[] args) {
		Computer c=new Computer();
		c.start();
		c.useUSB(new Mouse());
		c.useUSB(new Keyboard());
		c.close();
	}
}
