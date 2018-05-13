package com.itheima.job_day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
	public static void main(String[] args) throws ReflectiveOperationException {
		/*ͨ�������ȡ���췽����ʹ��
		 * Class�еķ���:
		 * 	Constructor<?>[] getConstructors()--��ȡ����public���췽�������вκ��޲�
		 * 	Constructor<T> getConstructor(Class<?>...parameterTypes) �����ǿɱ����(�ɲ�д)
		 * 	T newInstance()----ֻ�ܻ�ȡ�޲�,Ҫ��ȡ�вι���
		 * Constructor�еķ���:
		 * 	T newInstance(Object... initargs) --�����ǿɱ����,�ʿղ��вζ��ɻ�ȡ
		 * */
		Class clazz=Class.forName("com.itheima.job_day13.Student");
		//System.out.println(clazz);
		
		//method(clazz);
		
		//method2(clazz);
		
		//��ȡ�вι���---����1����ΪString������2����Ϊint
		Constructor c=clazz.getConstructor(String.class,int.class);//ȡ�ù��췽��
		System.out.println(c);
		Object obj=c.newInstance("lisi",30);//ͨ�����췽����������
		System.out.println(obj);
		
	}

	public static void method2(Class clazz)
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//��ȡ�޲ι���ķ�����----Constructor�ķ���T newInstance(Object... initargs) 
		Constructor c=clazz.getConstructor();//�����ȡ�޲ι���
			System.out.println(c);
		Object obj=c.newInstance();
		System.out.println(obj);
	}

	public static void method(Class clazz) {
		//��ȡ�޲ι���ķ���һ
		//Constructor<?>[] getConstructors() :��ȡ����public���εĹ��췽��
		Constructor[] cs=clazz.getConstructors();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		/*�����ȡ�������е�public���췽��:Student����2������һ���޲�һ���в�*/
	}
}
