package com.itheima.homework.job_day06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Test1 {
	/*第一题：分析以下需求，并用代码实现
	1.生成10个1至100之间的随机整数(不能重复)，存入一个List集合
	2.然后利用迭代器和增强for循环分别遍历集合元素并输出
	3.如：15 18 20 40 46 60 65 70 75 91(可以无序)*/
	public static void main(String[] args) {
		Random r=new Random();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<10;i++){
			int num=r.nextInt(100)+1;
			if(i==0){
				list.add(num);
			}else if(!list.contains(num)){
				list.add(num);
			}else{
				i--;
			}
		}
		
		//迭代器遍历
		System.out.println("迭代器遍历集合中的元素:");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//增强for循环遍历
		System.out.println("foreach遍历集合中元素:");
		for(Integer i:list)
			System.out.println(i);
			
		
	}
}
