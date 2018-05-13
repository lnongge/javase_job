package com.itheima.homework.job_day08;

public class Test1 {
	/*第一题：分析以下需求，并用代码实现
	利用递归求5!*/
	public static void main(String[] args) {
		int n=5;
		int result=jc(5);
		System.out.println(n+"!="+result);
	}

	private static int jc(int i) {
		if(i==1)
			return 1;
		return i*jc(i-1);
	}
}
