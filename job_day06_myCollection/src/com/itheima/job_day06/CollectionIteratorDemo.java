package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIteratorDemo {
	//���ϵı�������:������--�������еļ��϶�����forѭ����������,������forѭ���ļ��Ͽ����õ�����
	public static void main(String[] args) {
		Collection c=new ArrayList<>();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
