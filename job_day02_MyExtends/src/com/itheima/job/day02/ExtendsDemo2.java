package com.itheima.job.day02;

public class ExtendsDemo2 {
	/*继承中成员变量的访问*/
	public static void main(String[] args) {
		Kid k=new Kid();
		k.show();
	}
}
class Dad{
	String name="王建林";
}
class Kid extends Dad{
	String name="王思聪";
	public void show(){
		String name="王五葱";
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(name);
	}
}
