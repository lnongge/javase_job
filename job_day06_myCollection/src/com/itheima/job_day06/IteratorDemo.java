package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	/*�����޸��쳣ConcurrentModificationException
	 * ���������Կ����Ǽ��ϵ�һ������,�õ���������ʱ�����������Ԫ���뼯�����Ԫ�ز�һ��ʱ�ͻᱨ�����޸��쳣
	 * �������:
	 * 1�õ���������ʱ,�õ�����ȥ�޸ļ������Ԫ��
	 * 2��forѭ��ȥ��������---
	 * */
	
	public static void main(String[] args) {
		//Collection c=new ArrayList<>();
		List<String> c=new ArrayList<>();
		c.add("hello");
		c.add("word");
		c.add("java");
		Iterator<String> it=c.iterator();
		//ListIterator it=c.listIterator();
		while(it.hasNext()){
			if(it.next().equals("java"))
				//c.add("android");����
				c.set(1, "android");//������
				//c.remove(1);����
				//it.add("android");
		}
		System.out.println(c);
	}
}
