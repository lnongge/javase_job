package com.itheima.homework.job_day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test2 {
	/*1.����һ��Person��,
		������
			String����: ����name,
			int����: ����age
		����private����.
		Ҫ��:���ɿղκ��вι��췽��,����getXxx��setXxx����.
		�ڸ����ж���һ��public void show1()����,��ӡ:"�������Ա".
		�ڸ����ж���һ��public String show2()����,����"���ǲ���".
		�ڸ����ж���һ��public void show3(String name,int age)����,��ӡ���������䣬��ʽ:"���� : ����".
		�ڸ����ж���һ��public String show4(String name)����,�������name����.
	2.ͨ��ʹ�÷����ֶδ�������Ķ���,�����øö�������4��������
	��ӡ������£�
		�������Ա
		���ǲ���
		���� : 10
		����*/
	public static void main(String[] args) throws ReflectiveOperationException {
		//�����ֽ������
		Class c=Class.forName("com.itheima.homework.job_day13.Person");
		//�޲δ�������
		Object p=c.newInstance();
		//��ȡshow1����,��ִ��
		Method m1=c.getMethod("show1");
		m1.invoke(p);
		//��ȡshow2������ִ��
		Method m2=c.getMethod("show2");
		System.out.println(m2.invoke(p));
		//��ȡshow3������ִ��
		Method m3=c.getMethod("show3", String.class,int.class);
		m3.invoke(p, "����",10);
		//��ȡshow4����
		Method m4 =c.getMethod("show4", String.class);
		System.out.println(m4.invoke(p, "����"));
	}
}
