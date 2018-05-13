package com.itheima.homework.job_day08;

public class Test3 {
	/*	有如下数列(从第三项开始,每一项的值是其前面两项值的和):
		第一项: 1
		第二项: 1
		第三项: 2
		第四项: 3
		第五项: 5
		第六项: 8
		第七项: 13
		第八项: 21
		第九项: 33
		//....
		利用递归计算第20项是多少?*/
	public static void main(String[] args) {
		int n=20;
		int nNum=nNum(n);
		System.out.println("第"+n+"项是:"+nNum);
	}

	private static int nNum(int n) {
		if(n==1||n==2)
			return 1;
		return nNum(n-1)+nNum(n-2);
	}
	
}
