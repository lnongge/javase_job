package com.itheima.job.homework.day01;

public class Test4 {
	/*
	 * 第四题：分析以下需求，并用代码实现 要求:完成代码(按照标准格式写)，然后在测试类中测试。
	 *  1.项目经理类 属性：姓名 工号 工资 奖金 行为：工作work
	 *  2.程序员类 属性：姓名 工号 工资 行为：工作work 
	 *  3.测试类 分别创建经理类对象和程序员对象,利用对象调用各自的方法
	 */
	public static void main(String[] args) {
		Manager m=new Manager("岳不群","m001",1000,500);
		m.work();
		Coder c=new Coder("令狐冲","c001",10000,5000);
		c.work();
	}
}
