package com.itheima.job_day05;

public class RegexDemo {
	/*能够编写判断字符串中是否包含元音字符
	 * 原因字母:a e i o u 或A E I O U*/
	public static void main(String[] args) {
		String str="qeq".toLowerCase();//我先把字符串全转成小写就不用判断大写的情况了
		boolean f=str.matches(".[aeiou].");
		System.out.println(f);
	}
}
