package com.itheima.homework.job_day07;

import java.util.ArrayList;

public class Test1 {
	/*��һ�⣺�����������󣬲��ô���ʵ��
	1.����һ������Ϊ10��int����,������10��int���͵�����,������һЩ�������ظ���
	�磺int[] arr = { 3, 2, 1, 4, 5, 6, 4, 8, 3, 10 }; 
	2.���ü��ϵ�֪ʶ���������ȥ��,��ȥ�غ��Ԫ�ش���������,���ܸı�������ԭ�����ֵĴ�С˳��
	3.��ӡ�������е�����*/
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 5, 6, 4, 8, 3, 10 };
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(!list.contains(arr[i])){
				list.add(arr[i]);
			}
		}
		//�������е�
		Object[] array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
