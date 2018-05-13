package com.itheima.job_day05;

public class RegexDemo2 {
	/*能够编写利用切割字符串的代码
	 * string split(string regex) --这个方法参数是其实是一个正则表达式
	 * */
	public static void main(String[] args) {
		/*
		 * 切割字符串"aa,bb,cc"; 
		 * 切割字符串"-1 99 4 23"; 
		 * 切割字符串"-1   99 4     23";
		 */
		String str1="aa,bb,cc";
		String str2="-1 99 4 23";
		String str3="-1   99 4     23";
		String[] strs1=str1.split(",");
		printStr(strs1);
		String[] strs2=str2.split(" ");
		printStr(strs2);
		//String[] strs3=str3.split(" ");这么写有漏网之鱼
		String[] strs3=str3.split(" +");
		printStr(strs3);
	}
	public static void printStr(String[] str){
		System.out.print("[");
		for (int i = 0; i < str.length; i++) {
			if(i==str.length-1){
				System.out.println(str[i]+"]");
			}else{
				System.out.print(str[i]+",");
			}
		}
	}
}
