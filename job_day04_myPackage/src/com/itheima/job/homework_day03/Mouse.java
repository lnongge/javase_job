package com.itheima.job.homework_day03;

public class Mouse implements USB{

	@Override
	public void open() {
		System.out.println("��������USB");
	}

	@Override
	public void close() {
		System.out.println("�Ͽ�����USB");
	}

}
