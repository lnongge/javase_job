package com.itheima.job_day13;

import java.lang.reflect.Field;

public class ReflectDemo3 {
	/*����һ��person��
	 * ����:name(public) age(private)
	 * ����:�޲�,�вι���,set/get����
	 * ����Test������
	 * ʹ�÷����ȡ�������Բ��޸�"����",24
	 * */
	public static void main(String[] args) throws ReflectiveOperationException {
		//��ȡperson����ֽ������
		Class c=Class.forName("com.itheima.job_day13.Person");
		//��������
		Object per=c.newInstance();
		//��ȡpublic���Ժ�private����
		Field name=c.getField("name");
		Field age=c.getDeclaredField("age");
		age.setAccessible(true);
		System.out.println("--�޸�ǰ��Ϣ--");
		System.out.println("����:"+name.get(per));
		System.out.println("����:"+age.get(per));
		name.set(per, "����");
		age.set(per, 18);
		System.out.println("--�޸ĺ���Ϣ--");
		System.out.println("����:"+name.get(per));
		System.out.println("����:"+age.get(per));
	}
}
