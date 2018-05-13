package com.itheima.job_day08;

public class RecurrenceDemo2 {
	/*递归求斐波那契列数(即不死神兔子)*/
	public static void main(String[] args) {
		int result=noDieRobbitNum(20);
		System.out.println(result);
	}

	private static int noDieRobbitNum(int i) {
		if(i==1||i==2){
			return 1;
		}
		return noDieRobbitNum(i-1)+noDieRobbitNum(i-2);
	}
	
}
