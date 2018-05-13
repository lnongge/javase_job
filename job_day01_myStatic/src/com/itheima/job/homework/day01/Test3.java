package com.itheima.job.homework.day01;

public class Test3 {
	/*
	 * 第三题：分析以下需求，并用代码实现 要求:完成代码(按照标准格式写)，然后在测试类中测试。 
	 * 1.手机类Phone属性:品牌brand,价格price 无参构造,有参构造 行为:打电话call,发短信sendMessage,玩游戏,playGame 
	 * 2.测试类创建Phone类对象,调用Phone类中的方法
	 * 
	 * 思考:假设所有的手机都有属性屏幕的尺寸(int size),而且假设所有手机的屏幕尺寸为6,应该如何实现?
	 */
	public static void main(String[] args) {
		Phone.setSize(6);
		Phone p1=new Phone("huawei",2400.0);
		p1.call();
		p1.sendMessage();
		p1.playGame();
		Phone p2=new Phone("oppo",2199.9);
		p2.call();
		p2.sendMessage();
		p2.playGame();
	}
}
