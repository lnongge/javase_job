package com.itheima.job_day13;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilsDemo {
	/*beanutils
	 * static void setProperty(Object bean,String name,object value)
	 * static String getProperty(Object bean,String name)
	 * static void populate(Object bean,Map proterties)---Map<String,Object>
	 * 注:BeanUtils的setProperty和getProperty方法底层并不是直接操作成员变量，而是操作和成员变量名有关的get和set方法
	 * 		populate方法底层是调用setProperty方法,所有要是javaBean没有set/get方法,无法添加成功
	 * */
	public static void main(String[] args) throws ReflectiveOperationException, InvocationTargetException {
		//使用BeanUtils的setProperty和getProperty方法
		Object p1=new Person();
		//System.out.println(p1.getClass());得到的是Person不是Object
		BeanUtils.setProperty(p1, "name", "成龙");
		BeanUtils.setProperty(p1, "age", 60);
		System.out.println(BeanUtils.getProperty(p1,"name"));
		System.out.println(BeanUtils.getProperty(p1,"name"));
		System.out.println(p1);
		//使用BeanUtils的populat方法
		Person p=new Person();
		HashMap<String,Object> hm=new HashMap<>();
		hm.put("name", "李小龙");
		hm.put("age", 30);
		hm.put("gender", "男");//Person类没有gendar属性,这样也不会报错,它会自动忽视
		BeanUtils.populate(p, hm);
		System.out.println(p);
	}
}
