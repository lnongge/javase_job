package com.itheima.homework.job_day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test1 {
	/*1.����һ��User��,
		������
			�û���:userName,
			����:password,
		����private,String����.
		Ҫ��:���ɿղκ��вι��췽��,����getXxx��setXxx����,����toString()����.
	2.ͨ������ķ�ʽ����User����(�޲κ��в�),
		�޲ζ�����Ҫ���õ�������������zhangsan��123
		�вζ�����Ҫ���õ�������������lisi��456
		����ӡ�ö���.
	��ӡ������£�
	User [userName=zhangsan, password=123]
	User [userName=lisi, password=456]*/
	public static void main(String[] args) throws ReflectiveOperationException {
		//��ȡ�ֽ������
		Class c=Class.forName("com.itheima.homework.job_day13.User");
		//�޲δ�������
		Object user = c.newInstance();
		//��������ֵ
		Field f=c.getDeclaredField("userName");
		f.setAccessible(true);
		f.set(user, "zhangsan");
		Field psd=c.getDeclaredField("password");
		psd.setAccessible(true);
		psd.set(user, "123");
		System.out.println(user);
		//�вδ�������
		Constructor cons=c.getConstructor(String.class,String.class);
		Object user2=cons.newInstance("lisi","456");
		System.out.println(user2);
		
		
	}
	
}
