package com.itheima.job_day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*Map�洢�Զ������*/
public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<Person2,Integer> hm=new HashMap<>();
		
		Person2 p1=new Person2("����",34);
		Person2 p2=new Person2("��־��",40);
		Person2 p3=new Person2("��־��",40);
		
		hm.put(p1, 34);
		hm.put(p2, 40);
		hm.put(p3, 40);
		//��������
		Set<Map.Entry<Person2,Integer>> entrySet=hm.entrySet();
		for (Entry<Person2, Integer> entry : entrySet) {
			Person2 p=entry.getKey();
			int age=entry.getValue();
			//Integer value = entry.getValue();
			System.out.println(p+"==="+age);
		}
		
	}
}	
