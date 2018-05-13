package com.itheima.homework.job_day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test2 {
	/*1.定义一个Person类,
		属性有
			String类型: 姓名name,
			int类型: 年龄age
		都是private类型.
		要求:生成空参和有参构造方法,生成getXxx和setXxx方法.
		在该类中定义一个public void show1()方法,打印:"黑马程序员".
		在该类中定义一个public String show2()方法,返回"传智播客".
		在该类中定义一个public void show3(String name,int age)方法,打印姓名和年龄，格式:"姓名 : 年龄".
		在该类中定义一个public String show4(String name)方法,将传入的name返回.
	2.通过使用反射手段创建该类的对象,并调用该对象以上4个方法。
	打印结果如下：
		黑马程序员
		传智播客
		张三 : 10
		李四*/
	public static void main(String[] args) throws ReflectiveOperationException {
		//创建字节码对象
		Class c=Class.forName("com.itheima.homework.job_day13.Person");
		//无参创建对象
		Object p=c.newInstance();
		//获取show1方法,并执行
		Method m1=c.getMethod("show1");
		m1.invoke(p);
		//获取show2方法并执行
		Method m2=c.getMethod("show2");
		System.out.println(m2.invoke(p));
		//获取show3方法并执行
		Method m3=c.getMethod("show3", String.class,int.class);
		m3.invoke(p, "张三",10);
		//获取show4方法
		Method m4 =c.getMethod("show4", String.class);
		System.out.println(m4.invoke(p, "李四"));
	}
}
