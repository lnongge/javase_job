package com.itheima.job_day05;

public class RegexDemo2 {
	/*�ܹ���д�����и��ַ����Ĵ���
	 * string split(string regex) --���������������ʵ��һ��������ʽ
	 * */
	public static void main(String[] args) {
		/*
		 * �и��ַ���"aa,bb,cc"; 
		 * �и��ַ���"-1 99 4 23"; 
		 * �и��ַ���"-1   99 4     23";
		 */
		String str1="aa,bb,cc";
		String str2="-1 99 4 23";
		String str3="-1   99 4     23";
		String[] strs1=str1.split(",");
		printStr(strs1);
		String[] strs2=str2.split(" ");
		printStr(strs2);
		//String[] strs3=str3.split(" ");��ôд��©��֮��
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
