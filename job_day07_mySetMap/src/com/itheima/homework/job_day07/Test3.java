package com.itheima.homework.job_day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
	/*1.利用键盘录入，输入一个字符串
	2.统计该字符串中各个字符的数量(提示:字符不用排序)
	3.如：
	用户输入字符串"wuyanzu-he^wo~shuo!ta@zui$shuai??"
		程序输出结果：
		!=1
		e=1
		@=1
		$=1
		a=3
		n=1
		o=2
		h=3
		i=2
		-=1
		w=2
		u=5
		t=1
		s=2
		~=1
		^=1
		?=2
		z=2
		y=1*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据:");
		String s=sc.nextLine();
		HashMap<Character, Integer> hm=new HashMap<>();
		/*//第一种方法用两个for循环来做
			//boolean flag=true;//不用Map的做法
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				int count=0;
				for (int j = 0; j < s.length(); j++) {
					if(ch==s.charAt(j)){
						count++;
						//if(j<i){//不用Map的做法需要判断
						//flag=false;
						//break;
					//}else{
					//	count++;
					//}
					}
						
				}
				hm.put(ch, count);
			}*/
		//第二种方法:用一个for循环来做
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else{
				hm.put(ch, 1);
			}
		}
		
		
			//遍历输出Map
			Set<Map.Entry<Character,Integer>> set=hm.entrySet();
			for (Map.Entry<Character, Integer> entry : set) {
				char c=entry.getKey();
				int num=entry.getValue();
				System.out.println(c+"="+num);
				//如果我想要输出结果形式是:!(1)e(1)...
				//System.out.print(c+"("+num+")");
			}	
		}
		
	
}
