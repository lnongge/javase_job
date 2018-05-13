package com.itheima.job_day07;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
	/*Collections工具类中常用的方法*/
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(Collections.binarySearch(list, 7));
	}
}
