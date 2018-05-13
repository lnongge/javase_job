package com.itheima.job_day05;

public class ObjectDemo2 {
	/*获取字节码对象(3种方法)---1用Object的getClass(方法)
	 * 
	 * */
	public static void main(String[] args) throws ClassNotFoundException {
		Student s=new Student();
		//第一种--用Object的getClass()方法
		Class clazz1=s.getClass();
		System.out.println(clazz1);
		//第二种方式---用(要求的字节码对象的)类的静态属性class--每一个类默认有class属性
		Class clazz2=Student.class;
		System.out.println(clazz2);
		//第三种方式---用字节码类的静态方法forName(String s) s是要求的字节码对象的类的完整类名--此方法需要抛出ClassNotFoundException异常8
		Class clazz3=Class.forName("com.itheima.job_day05.Student");
		System.out.println(clazz3);
	}
}
