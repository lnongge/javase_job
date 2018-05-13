package com.itheima.homework.job_day08;

public class Test2 {
	public static void main(String[] args) {
		/*利用递归写出求1到n(n<=1000)的数字的和案例*/
		int n=1000;
		int sum=sum(n);
		System.out.println("1到"+n+"的数字和是:"+sum);
	}

	private static int sum(int n) {
		if(n==1)
			return 1;
		return n+sum(n-1);
	}
	
}
