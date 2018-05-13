package com.itheima.job.homework.day01;

import java.util.ArrayList;

public class Test1 {
	/*
	 * 第一题:分析以下需求,并用代码实现 向集合中添加四个人姓名做为集合的元素:"张三","李四","王五","赵六" 遍历集合中的元素并输出
	 */
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		//遍历集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
