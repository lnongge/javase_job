package com.itheima.job.homework_day03;

public class Test2 {
	/*
第二题：分析以下需求，并用代码实现
	进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
	1.定义USB接口:
		开启功能open()
		关闭功能close()
	2.定义鼠标类Mouse:
		要符合USB接口，重写open和close方法，格式参照打印效果
	3.定义键盘类Keyboard:
		要符合USB接口，重写open和close方法，格式参照打印效果
	4.定义笔记本类Computer:
		开机功能start
		关机功能stop
		定义使用USB设备的功能：useUSB(参数)
		要求:既能使用鼠标也能使用键盘,使用USB功能调用开启和关闭功能	
	5.定义测试类:
		创建电脑对象,依次调用开机方法、使用USB设备鼠标、使用USB设备键盘、关机方法
		打印效果如下:
			开机
			连接鼠标的USB
			断开鼠标的USB
			连接键盘的USB
			断开键盘的USB
			关机*/
	public static void main(String[] args) {
		Computer c=new Computer();
		c.start();
		c.useUSB(new Mouse());
		c.useUSB(new Keyboard());
		c.close();
	}
}
