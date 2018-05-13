package com.itheima.job.day03_02;

public class InnerDemo2 {
	public static void main(String[] args) {
		Outer2 o=new Outer2();
		o.method();
		/*Outer2.Inner i= o.new Inner();
		i.function();*/
		
		//静态修饰内部类
		Outer2.Inner i=new Outer2.Inner();
		i.function();
		i.function1();//通过内部类对象调用内部类静态方法
		Outer2.Inner.function1();//通过内部类类名直接调用内部类静态方法
	}
}	
class Outer2{//这里这个Outer类没写修饰符并不是default,而是public?应该是
	int num=10;
	public void method(){
		System.out.println("Outer2的成员方法");
	}
	/*class Inner{
		public void function(){
			System.out.println("Outer2的内部类Inner2");
		}
	}*/
	
	//静态修饰内部类
	static class Inner{
		public void function(){
			System.out.println("Outer2的内部类Inner2");
		}
		public static void function1(){
			System.out.println("Outer2的内部类Inner2的方法2");
		}
	}
}