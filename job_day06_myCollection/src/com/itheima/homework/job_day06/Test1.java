package com.itheima.homework.job_day06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Test1 {
	/*��һ�⣺�����������󣬲��ô���ʵ��
	1.����10��1��100֮����������(�����ظ�)������һ��List����
	2.Ȼ�����õ���������ǿforѭ���ֱ��������Ԫ�ز����
	3.�磺15 18 20 40 46 60 65 70 75 91(��������)*/
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
		
		//����������
		System.out.println("���������������е�Ԫ��:");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//��ǿforѭ������
		System.out.println("foreach����������Ԫ��:");
		for(Integer i:list)
			System.out.println(i);
			
		
	}
}
