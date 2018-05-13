package com.itheima.job_day13;

import java.lang.reflect.Field;

public class ReflectDemo3 {
	/*定义一个person类
	 * 属性:name(public) age(private)
	 * 方法:无参,有参构造,set/get方法
	 * 定义Test测试类
	 * 使用反射获取两个属性并修改"李四",24
	 * */
	public static void main(String[] args) throws ReflectiveOperationException {
		//获取person类的字节码对象
		Class c=Class.forName("com.itheima.job_day13.Person");
		//创建对象
		Object per=c.newInstance();
		//获取public属性和private属性
		Field name=c.getField("name");
		Field age=c.getDeclaredField("age");
		age.setAccessible(true);
		System.out.println("--修改前信息--");
		System.out.println("姓名:"+name.get(per));
		System.out.println("年龄:"+age.get(per));
		name.set(per, "李四");
		age.set(per, 18);
		System.out.println("--修改后信息--");
		System.out.println("姓名:"+name.get(per));
		System.out.println("年龄:"+age.get(per));
	}
}
