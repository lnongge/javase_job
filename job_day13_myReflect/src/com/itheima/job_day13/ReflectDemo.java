package com.itheima.job_day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
	public static void main(String[] args) throws ReflectiveOperationException {
		/*通过反射获取构造方法并使用
		 * Class中的方法:
		 * 	Constructor<?>[] getConstructors()--获取所有public构造方法包括有参和无参
		 * 	Constructor<T> getConstructor(Class<?>...parameterTypes) 参数是可变参数(可不写)
		 * 	T newInstance()----只能获取无参,要获取有参构造
		 * Constructor中的方法:
		 * 	T newInstance(Object... initargs) --参数是可变参数,故空参有参都可获取
		 * */
		Class clazz=Class.forName("com.itheima.job_day13.Student");
		//System.out.println(clazz);
		
		//method(clazz);
		
		//method2(clazz);
		
		//获取有参构造---参数1类型为String，参数2类型为int
		Constructor c=clazz.getConstructor(String.class,int.class);//取得构造方法
		System.out.println(c);
		Object obj=c.newInstance("lisi",30);//通过构造方法创建对象
		System.out.println(obj);
		
	}

	public static void method2(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//获取无参构造的方法二----Constructor的方法T newInstance(Object... initargs) 
		Constructor c=clazz.getConstructor();//这里获取无参构造
			System.out.println(c);
		Object obj=c.newInstance();
		System.out.println(obj);
	}

	public static void method(Class clazz) {
		//获取无参构造的方法一
		//Constructor<?>[] getConstructors() :获取所有public修饰的构造方法
		Constructor[] cs=clazz.getConstructors();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		/*这里获取的是所有的public构造方法:Student类由2个构造一个无参一个有参*/
	}
}
