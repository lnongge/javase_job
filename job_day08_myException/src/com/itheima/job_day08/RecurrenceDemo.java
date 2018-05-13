package com.itheima.job_day08;

public class RecurrenceDemo {
	/*µÝ¹éÇó5µÄ½×³Ë*/
	public static void main(String[] args) {
		int result=jc(5);
		System.out.println(result);
	}

	private static int jc(int i) {
		if(i==1)
			return 1;
		return i*jc(i-1);
	}
}
