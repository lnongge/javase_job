package com.itheima.job_day07;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//��������
		HashSet<Student> hs=new HashSet<>();
		//��������Ԫ��
		Student s1=new Student("����",40);
		Student s2=new Student("����",35);
		Student s3=new Student("����",40);
		//��Ԫ����ӵ�����
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		//����set����
		for (Student student : hs) {
			System.out.println(student);
		}
	}
}
