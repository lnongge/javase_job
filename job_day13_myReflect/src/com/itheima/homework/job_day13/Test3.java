package com.itheima.homework.job_day13;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	/*定义一个JavaBean类ClassRoom
		  属性有: 班号：        int classNo  
				  班级名称： String className
				  班级人数      int stuCount
				  学生名称   String[] stuName
		  生成toString()方法.
	   创建ClassRoom对象，使用beanUtils工具类为本对象赋值。
	   打印结果如下：	
	   ClassRoom [classNo=1, className=一年级, stuCount=3, stuName=[张三, 李四, 王五]]*/
	public static void main(String[] args) {
		ClassRoom cr=new ClassRoom();
		Map<String,Object> map=new HashMap<>();
		map.put("classNo", 1);
		map.put("className", "一年级");
		map.put("stuCount", 3);
		map.put("stuName", "[张三, 李四, 王五]");
	}
}
