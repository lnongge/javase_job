package com.itheima.homework.job_day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
	/*1.���ü���¼�룬����һ���ַ���
	2.ͳ�Ƹ��ַ����и����ַ�������(��ʾ:�ַ���������)
	3.�磺
	�û������ַ���"wuyanzu-he^wo~shuo!ta@zui$shuai??"
		������������
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
		System.out.println("����������:");
		String s=sc.nextLine();
		HashMap<Character, Integer> hm=new HashMap<>();
		/*//��һ�ַ���������forѭ������
			//boolean flag=true;//����Map������
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				int count=0;
				for (int j = 0; j < s.length(); j++) {
					if(ch==s.charAt(j)){
						count++;
						//if(j<i){//����Map��������Ҫ�ж�
						//flag=false;
						//break;
					//}else{
					//	count++;
					//}
					}
						
				}
				hm.put(ch, count);
			}*/
		//�ڶ��ַ���:��һ��forѭ������
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else{
				hm.put(ch, 1);
			}
		}
		
		
			//�������Map
			Set<Map.Entry<Character,Integer>> set=hm.entrySet();
			for (Map.Entry<Character, Integer> entry : set) {
				char c=entry.getKey();
				int num=entry.getValue();
				System.out.println(c+"="+num);
				//�������Ҫ��������ʽ��:!(1)e(1)...
				//System.out.print(c+"("+num+")");
			}	
		}
		
	
}
