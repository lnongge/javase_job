package com.itheima.job_day06;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		/*void add(int index, element)--��(whyû�з���ֵ?��Ϊlist���Դ洢�ظ���Ԫ��,����һ���ܴ洢�ɹ�)
		 * E get(index)--��
		 * E removed(intindex)--ɾ
		 * E set(int index, element)--��
		 * */
		List<String> list=new ArrayList<>();
		list.add(0,"hello");
		list.add(0,"word");
		list.add(1,"java");
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.set(0, "android"));
		System.out.println(list);
	}
}
