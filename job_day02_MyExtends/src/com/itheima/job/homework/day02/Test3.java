package com.itheima.job.homework.day02;

public class Test3 {
	/*�����⣺�����������󣬲��ô���ʵ��
	1.��֪ѧ�������ʦ�����£�
		����:
			����,����
		��Ϊ:
			�Է�
		��ʦ�����еķ���:
			����
		ѧ�������еķ���:
			ѧϰ
	2.Ҫ��:���ϳ�ȡһ������,���������඼�̳��������,���е�����д�ڸ����У�������д�����еķ���
		��д������:�����������Ĳ���*/
	public static void main(String[] args) {
		Teacher t=new Teacher("С��Ů",20);
		t.eat();
		t.teach();
		Student1 s1=new Student1();
		s1.setName("���");
		s1.setAge(18);
		s1.eat();
		s1.learn();
		
	}
}
