package com.itheima.job.day03_02;

public class InnerDemo {
	//成员内部类概述与使用
	public static void main(String[] args) {
		Outer o=new Outer();
		o.show();
		//Outer.Inner oi=new Outer.Inner();
		/*左边:Outer.Inner---告诉编译器,我类Inner在类Outer里面.
		 * 	注:这里格式是跟访问包中的类一样,但是并不是访问包中的类.所以用Outer.Inner oi=new Outer.Inner()这种方式创建内部类无法成功
		 *右边:new Outer().new Inner()---因为内部类在外部类中,所有需要先创建外部类对象,然后用外部类对象再去创建内部类对象,最后用内部类对象取调用内部类的方法 
		 * 总结:创建内部类对象必须先创建外部类对象
		 * */
		Outer.Inner oi=new Outer().new Inner();
		//这句创建内部类的方式等于:Outer.Inner oi=o.new Inner();
		//但是两句创建出来的对象不一样,因为一个是对象new Outer()的内部类一个是对象O的内部类
		oi.function();
		
	}
}
class Outer{
	private int num=10;
	public void show(){
		System.out.println("我是Outer成员方法");
	}
	class Inner{//成员内部类
		public void function(){
			System.out.println("我是Inner成员方法,我可以取到Outer的私有成员变量num="+num);
		}
	}
}