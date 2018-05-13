package com.itheima.homework.job_day07;

import java.util.ArrayList;

public class Test1 {
	/*第一题：分析以下需求，并用代码实现
	1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
	如：int[] arr = { 3, 2, 1, 4, 5, 6, 4, 8, 3, 10 }; 
	2.利用集合的知识对数组进行去重,将去重后的元素存入新数组,不能改变数组中原来数字的大小顺序
	3.打印新数组中的内容*/
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 5, 6, 4, 8, 3, 10 };
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(!list.contains(arr[i])){
				list.add(arr[i]);
			}
		}
		//新数组中的
		Object[] array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
