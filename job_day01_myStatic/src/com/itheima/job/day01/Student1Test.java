package com.itheima.job.day01;

import java.util.Arrays;

public class Student1Test {
	/*
	 * 1 �Ƚ��ڴ�Ĳ��ܵ��ú���ڴ��
	 * ������:1���챻˽�� 2���г�Ա��static����
	 * ��:Arrays��--��������Ĵ󲿷ֲ���(����,�����)
	 * 		���췽����˽��������ֹ���౻��������
	 * */
	public static void main(String[] args) {
		print();
		Student1Test t=new Student1Test();
		t.print();
		Student1 s=new Student1();
		s.name="zhangsan";
		s.age=18;
		System.out.println("-----------");
		int[] arr=null;
		System.out.println(Arrays.toString(arr));
	}

	public static void print() {
		System.out.println("hello");
	}
	
}
