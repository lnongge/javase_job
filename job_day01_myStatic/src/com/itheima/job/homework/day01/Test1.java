package com.itheima.job.homework.day01;

import java.util.ArrayList;

public class Test1 {
	/*
	 * ��һ��:������������,���ô���ʵ�� �򼯺�������ĸ���������Ϊ���ϵ�Ԫ��:"����","����","����","����" ���������е�Ԫ�ز����
	 */
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		//��������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
