package com.itheima.job.homework_day03;

public class Computer {
	public void start(){
		System.out.println("����");
	}
	public void useUSB(USB usb ){
		usb.open();
		usb.close();
	}
	public void close(){
		System.out.println("�ػ�");
	}
}
