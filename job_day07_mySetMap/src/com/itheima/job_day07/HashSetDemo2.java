package com.itheima.job_day07;

import java.util.HashSet;

public class HashSetDemo2 {
	/*��дequals()������hashcode()����*/
	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<>();
		Person p1=new Person("����",40);
		Person p2=new Person("����",35);
		/*System.out.println("����".hashCode());
		System.out.println(p1.getName().hashCode());*/
		System.out.println();
		hs.add(p1);
		hs.add(p2);
		for (Person person : hs) {
			System.out.println(person);
		}
	}
}
