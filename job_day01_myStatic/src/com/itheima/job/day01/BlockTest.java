package com.itheima.job.day01;
public class BlockTest {/*代码块执行顺序*/
	static{
		System.out.println("这是BlockTest的静态代码块");//1
	}
	{
		System.out.println("这是BlockTest的构造代码块");//6
	}
	public static void main(String[] args) {
		//System.out.println("这是BlockTest类的main方法执行");//2
		Coder c=new Coder();
		BlockTest bt=new BlockTest();
		
	}
}
/* 一个java文件中可以有多个类,但是只能有一个是public修饰.
 * 注:这个Coder类与BlockTest类是并列关系,不是内部类(把Coder类放在BlockTest类的{}内才是内部类),
 * Coder类这个是独立的类,效果与单独写在另一个.java文件中的类一样
 * 	1而且如果你在创建一个Coder.java类,会报错类同名了
 * */
class Coder{
	static {
		System.out.println("这是Coder类的静态代码块");// 3
	}
	{
		System.out.println("这是Codr类的构造代码块");//4
	}
	public Coder(){
		System.out.println("这是Coder的构造方法执行");//5
	}
}