package com.itheima.homework.job_day07;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
	/*第二题：分析以下需求，并用代码实现	
	键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
	如键盘录入："wahahahahahahakuangquanshui"
	控制台打印：
			w
			g
			u
			s
			q
			a
			n
			k
			h
			i*/
	public static void main(String[] args) {
		/*用set来做*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据:");
		String s = sc.nextLine();
		//把输入的字符串的每个字符存储到Set,利用set的特点去重
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		//遍历Set
		 for (char ch : hs) {
			System.out.println(ch);
		}
	}
}
