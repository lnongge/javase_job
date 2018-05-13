package com.itheima.job.day01;

public class MyArrayUtil {
	/*
	 * 定一个关于数组的操作的工具类
	 * */
	//1.构造方法私有
	private MyArrayUtil(){}
	//2.所有成员静态
	/**
	 * 求数组的最大值
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr){
		if(arr==null||arr.length==0)
			return -1;
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	/**
	 * 求给定数组中element的索引,若不存在反悔-1;
	 * @param arr
	 * @param element
	 * @return
	 */
	public static int getIndex(int[] arr,int element){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element)
				return i;
		}
		
		return -1;
	}
}
