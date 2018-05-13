package com.itheima.job.day01;

public class MyArrayUtilTest {
	public static void main(String[] args) {
		//int[] arr={1,3,-2,3,5,-1};
		int[] arr=new int[5];
		int max=MyArrayUtil.getMax(arr);
		System.out.println("max:"+max);
		int index=MyArrayUtil.getIndex(arr, 3);
		System.out.println("所求元素在数组中的索引:"+index);
	}
}	
