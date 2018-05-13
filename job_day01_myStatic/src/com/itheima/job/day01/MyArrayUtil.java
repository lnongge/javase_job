package com.itheima.job.day01;

public class MyArrayUtil {
	/*
	 * ��һ����������Ĳ����Ĺ�����
	 * */
	//1.���췽��˽��
	private MyArrayUtil(){}
	//2.���г�Ա��̬
	/**
	 * ����������ֵ
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
	 * �����������element������,�������ڷ���-1;
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
