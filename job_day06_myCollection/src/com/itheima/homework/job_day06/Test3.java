package com.itheima.homework.job_day06;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	/*第三题：分析以下需求，并用代码实现
	1.有如下代码：
		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("a");
			list.add("a");
			list.add("c");
			list.add("c");
			list.add("a");
			list.add("d");
			
			noRepeat(list);
			System.out.println(list);
		}
	2.定义一个noRepeat()方法,要求对传递过来集合中进行元素去重
		public static void noRepeat(List<String> list){

		}
---------------------------------------------------------------*/
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("a");
		list.add("d");
		
		noRepeat(list);
		System.out.println(list);
	}

	private static void noRepeat(List<String> list) {
		for(int i=0;i<list.size();i++){//取到集合中的每个元素
			String s=list.get(i);
			for(int j=0;j<i;j++){//拿到集合中的元素,都与排在它前面的元素比较如果有相等的就是有重复的,则当前的元素删除
				if(list.get(j)==s){
					list.remove(i--);
				}
			}
		}
	}
}
