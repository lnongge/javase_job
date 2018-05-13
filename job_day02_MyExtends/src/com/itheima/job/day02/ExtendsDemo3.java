package com.itheima.job.day02;

public class ExtendsDemo3 {
	/*继承中成员方法的访问*/
	public static void main(String[] args) {
		Kid3 k=new Kid3();
		k.eat();
	}
}
class Dad3{
	public void eat(){
		System.out.println("小酌两口");
		System.out.println("喝高了,去睡觉");
	}
}
class Kid3 extends Dad3{
	public void eat(){
		System.out.println("好好吃饭,快快长个");
	}
}
