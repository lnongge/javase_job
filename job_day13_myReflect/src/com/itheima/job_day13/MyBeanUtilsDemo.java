package com.itheima.job_day13;

import java.util.HashMap;

public class MyBeanUtilsDemo {
	/*myBeanUtils测试类*/
	public static void main(String[] args) throws Exception {
		Person p=new Person();
		MyBeanUtils.setProperty(p, "name", "张三丰");
		MyBeanUtils.setProperty(p, "age", "100");
		String name=MyBeanUtils.getProperty(p, "name");
		System.out.println(name);
		System.out.println(p);
		Person p2=new Person();
		HashMap<String,Object> hm=new HashMap<>();
		hm.put("name", "李寻欢");
		hm.put("age", 20);//"20"报错
		hm.put("birth", "19191111");//"20"报错
		MyBeanUtils.populate(p2, hm);
		System.out.println(p2);
		
	}
}
