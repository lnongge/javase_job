package com.itheima.job.day02;

public class ExtendsDemo5 {
	/*this与super在构造方法中的使用*/
	public static void main(String[] args) {
		Zi z=new Zi();
	}
}
class Fu{
	public Fu(){
		System.out.println("我是fu类空参构造");
	}
	public Fu(int a){
		System.out.println("我是fu类的有参构造");
	}
}
class Zi extends Fu{
	public Zi(){
		
		System.out.println("我是zi类无参构造");
	}
	public Zi(int a){
		
		System.out.println("我是子类有参构造");
	}
}