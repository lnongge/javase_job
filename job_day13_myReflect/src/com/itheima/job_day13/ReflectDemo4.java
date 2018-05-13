package com.itheima.job_day13;

import java.lang.reflect.Method;

public class ReflectDemo4 {
	/*
	 * 反射调用public成员方法和private方法
	 * */
	public static void main(String[] args) throws ReflectiveOperationException {
		//获取字节码对象
		Class cl=Class.forName("com.itheima.job_day13.Person");
		//创建对象
		Object per = cl.newInstance();
		//调用无参,无返回值方法
		Method m=cl.getMethod("printPer");
		m.invoke(per);
		//调用无参有放回值方法
		Method m1=cl.getMethod("getName");
		Object name = m1.invoke(per);
		System.out.println(name);
		//调用有参无返回值方法--
		Method m2=cl.getMethod("setName", String.class);
		m2.invoke(per, "张无忌");
		//调用有参有返回值方法
		Method m3=cl.getMethod("functions", int.class);
		Object obj= m3.invoke(per, 10);
		System.out.println(obj);
		//调用私有的成员方法
		Method m4=cl.getDeclaredMethod("numAdd", int.class);
		m4.setAccessible(true);
		Object re = m4.invoke(per, 100);
		System.out.println(re);
	}
}
