package com.itheima.job.day03_02;

public class AnonymicInnerDemo {
	/*匿名内部类*/
	public static void main(String[] args) {
		Outer3 o3=new Outer3();
		o3.method();
	}
}
class Outer3{
	public void method(){
		new Inner3(){
			public void function(){
				System.out.println("function");
			}
		}.function();
	}
}
interface Inner3{
	public void function();
}