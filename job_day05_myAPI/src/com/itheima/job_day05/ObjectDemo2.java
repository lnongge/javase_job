package com.itheima.job_day05;

public class ObjectDemo2 {
	/*��ȡ�ֽ������(3�ַ���)---1��Object��getClass(����)
	 * 
	 * */
	public static void main(String[] args) throws ClassNotFoundException {
		Student s=new Student();
		//��һ��--��Object��getClass()����
		Class clazz1=s.getClass();
		System.out.println(clazz1);
		//�ڶ��ַ�ʽ---��(Ҫ����ֽ�������)��ľ�̬����class--ÿһ����Ĭ����class����
		Class clazz2=Student.class;
		System.out.println(clazz2);
		//�����ַ�ʽ---���ֽ�����ľ�̬����forName(String s) s��Ҫ����ֽ������������������--�˷�����Ҫ�׳�ClassNotFoundException�쳣8
		Class clazz3=Class.forName("com.itheima.job_day05.Student");
		System.out.println(clazz3);
	}
}
