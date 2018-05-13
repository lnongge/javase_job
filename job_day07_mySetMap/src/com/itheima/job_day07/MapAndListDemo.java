package com.itheima.job_day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MapAndListDemo {
	/*MapǶ��List*/
	public static void main(String[] args) {
		//����Map����
		HashMap<Character,List<Student>> hm=new HashMap<>();
		//����Map��ֵԪ��
		List<Student> list=new  ArrayList<>();
		List<Student> list2=new  ArrayList<>();
		list.add(new Student("��Ψ",18));
		list.add(new Student("��֮��",28));
		list2.add(new Student("����֥",38));
		list2.add(new Student("Ҷͯ",35));
		//��ӵ�map
		hm.put('a', list);
		hm.put('b', list2);
		
		//��������
		Set<Character> keySet = hm.keySet();
		for (Character ch : keySet) {
			System.out.println(ch);
			List<Student> l1=hm.get(ch);
			for (Student stu : l1) {
				System.out.println(stu.getName()+","+stu.getAge());
			}
		}
	}
}
