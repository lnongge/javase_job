package com.itheima.job.day01;

public class MethedReview {
	public static void main(String[] args) {
		int sum=sum(10,20);
		int sum2=sum(10,29,30);
		System.out.println("����֮��:"+sum);
		System.out.println("����֮��:"+sum2);
	}

	public static int sum(int i, int j, int k) {
		return i+j+k;
	}

	public static int sum(int i, int j) {
		return i+j;
	}
	
}
