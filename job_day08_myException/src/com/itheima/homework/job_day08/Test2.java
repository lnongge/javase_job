package com.itheima.homework.job_day08;

public class Test2 {
	public static void main(String[] args) {
		/*���õݹ�д����1��n(n<=1000)�����ֵĺͰ���*/
		int n=1000;
		int sum=sum(n);
		System.out.println("1��"+n+"�����ֺ���:"+sum);
	}

	private static int sum(int n) {
		if(n==1)
			return 1;
		return n+sum(n-1);
	}
	
}
