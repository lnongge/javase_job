package com.itheima.job_day13;

import java.lang.reflect.Method;

public class ReflectDemo4 {
	/*
	 * �������public��Ա������private����
	 * */
	public static void main(String[] args) throws ReflectiveOperationException {
		//��ȡ�ֽ������
		Class cl=Class.forName("com.itheima.job_day13.Person");
		//��������
		Object per = cl.newInstance();
		//�����޲�,�޷���ֵ����
		Method m=cl.getMethod("printPer");
		m.invoke(per);
		//�����޲��зŻ�ֵ����
		Method m1=cl.getMethod("getName");
		Object name = m1.invoke(per);
		System.out.println(name);
		//�����в��޷���ֵ����--
		Method m2=cl.getMethod("setName", String.class);
		m2.invoke(per, "���޼�");
		//�����в��з���ֵ����
		Method m3=cl.getMethod("functions", int.class);
		Object obj= m3.invoke(per, 10);
		System.out.println(obj);
		//����˽�еĳ�Ա����
		Method m4=cl.getDeclaredMethod("numAdd", int.class);
		m4.setAccessible(true);
		Object re = m4.invoke(per, 100);
		System.out.println(re);
	}
}
