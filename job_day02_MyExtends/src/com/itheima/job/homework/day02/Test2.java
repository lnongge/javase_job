package com.itheima.job.homework.day02;

public class Test2 {
	/*�ڶ��⣺�����������󣬲��ô���ʵ��
	1.������Ŀ������ 
		���ԣ�
			���� ���� ���� ����
		��Ϊ��
			����work
	2.�������Ա��
		���ԣ�
			���� ���� ����
		��Ϊ��
			����work
	3.Ҫ��:���ϳ�ȡһ������,���������඼�̳��������,���е�����д�ڸ����У�������д�����еķ���
		��д������:�����������Ĳ���*/
	public static void main(String[] args) {
		Coder c=new Coder("�ͫ|","s001",5000);
		c.work();
		Manager m=new Manager("�����","m001",2000,(byte)100);
		m.work();
	}
}
