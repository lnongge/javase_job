package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachDemo {
	/**/
	public static void main(String[] args) {
		/*Collection<Student> c=new ArrayList<>();
		c.add(new Student("ÁøÑÒ",18));
		c.add(new Student("¾°Ìð",20));
		for (Student student : c) {
			System.out.println(student.getName()+"-----"+student.getAge());
		}*/
		
		int[] arr ={1,2,3,4,4,5};
		int index=0;
		for (int i : arr) {
			System.out.println(i);
			if(index==4){
				arr[index]=6;
			}
			index++;
		}
		System.out.println("---");
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
}
