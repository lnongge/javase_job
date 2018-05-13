package com.itheima.job.homework_day03;

public class Test1 {
	/*第一题:分析以下需求,并用代码实现
	1.接口IPlay中有一个方法playGame()，在测试类中如何调用该方法？使用如下两种方式调用！
		方式1：创建子类实现接口的方式实现(通过实现类对象调用方法)
		方式2：用匿名内部类实现

	2.一个抽象类Fun中有一个抽象方法 fun() , 在测试类中如何调用该方法? 使用如下两种方式调用！
		方式1：创建子类继承抽象类的方式实现(通过子类对象调用方法)
		方式2：用匿名内部类实现*/
	

	public static void main(String[] args) {
		//1-方式1创建子类实现接口的方式实现(通过实现类对象调用方法)
		Phone p=new Phone();
		p.playGame();
		//1-方式2用匿名内部类实现
		new IPlay(){
			public void playGame(){
				System.out.println("打游戏2.0...");
			}
		}.playGame();
		//2-方式1
		FunSon fs=new FunSon();
		fs.fun();
		//2-方式2
		new Fun(){
			public void fun(){
				System.out.println("fun2.0...");
			}
		}.fun();
	}
}
interface IPlay{
	public void playGame();
}
class Phone implements IPlay{

	@Override
	public void playGame() {
		System.out.println("打游戏");
	}
	
}
//第二小题
abstract class Fun{
	public abstract void fun();
}
//第一种方法
 class FunSon extends Fun{

	@Override
	public void fun() {
		System.out.println("fun的子类");
	}
	
}