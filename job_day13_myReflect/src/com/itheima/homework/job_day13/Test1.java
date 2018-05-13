package com.itheima.homework.job_day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test1 {
	/*1.定义一个User类,
		属性有
			用户名:userName,
			密码:password,
		都是private,String类型.
		要求:生成空参和有参构造方法,生成getXxx和setXxx方法,生成toString()方法.
	2.通过反射的方式创建User对象(无参和有参),
		无参对象需要设置的姓名和密码是zhangsan和123
		有参对象需要设置的姓名和密码是lisi和456
		并打印该对象.
	打印结果如下：
	User [userName=zhangsan, password=123]
	User [userName=lisi, password=456]*/
	public static void main(String[] args) throws ReflectiveOperationException {
		//获取字节码对象
		Class c=Class.forName("com.itheima.homework.job_day13.User");
		//无参创建对象
		Object user = c.newInstance();
		//设置属性值
		Field f=c.getDeclaredField("userName");
		f.setAccessible(true);
		f.set(user, "zhangsan");
		Field psd=c.getDeclaredField("password");
		psd.setAccessible(true);
		psd.set(user, "123");
		System.out.println(user);
		//有参创建对象
		Constructor cons=c.getConstructor(String.class,String.class);
		Object user2=cons.newInstance("lisi","456");
		System.out.println(user2);
		
		
	}
	
}
