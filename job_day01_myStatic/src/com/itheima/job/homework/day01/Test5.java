package com.itheima.job.homework.day01;

public class Test5 {
/*
 * ������:������������,���ô���ʵ��
	����һ��������(ShapeTool)
		1.����һ:       
			�ڹ������ж���һ������(getLength)
				�β�:�����εĳ��Ϳ�
				����:���س����ε��ܳ�
			�ڹ������ж���һ������(getSize)
				�β�:�����εĳ��Ϳ�
				����:���س����ε����
		2.�����:
			�ڹ������ж���һ������(getLength)
				�β�:Բ�İ뾶
				����:����Բ���ܳ�
			�ڹ������ж���һ������(getSize)
				�β�:Բ�İ뾶
				����:����Բ�����
	����һ����������	
			�ڳ����ε����ж����������Ϳ��Ա
			�ڳ��������ж���һ������(getLength)
				�β�:��
				����:�󳤷��ε��ܳ�
			�ڳ��������ж���һ������(getSize)
				�β�:��
				����:�󳤷��ε����
	����һ��Բ����
			��Բ�ε����ж���뾶
			��Բ�����ж���һ������(getLength)
				�β�:��
				����:��Բ���ܳ�
			��Բ�����ж���һ������(getSize)
				�β�:��
				����:��Բ���ε����
5.���������,���������ĸ�����
	˼��:�����󳤷����ܳ���ʵ�ַ�ʽ���ָ����������������˼��?������,�����������,��Ϊ���ô�������,��ʡ�ڴ�
 * */
	public static void main(String[] args) {
		//�ù������󳤷��ε��ܳ�
		System.out.println("�����ε��ܳ���:"+ShapeTool.getLength(10, 20));
		System.out.println("�����ε������:"+ShapeTool.getSize(10, 20));
		System.out.println("Բ���ܳ���:"+ShapeTool.getLength(5));
		System.out.println("Բ�������:"+ShapeTool.getSize(5));
		
		System.out.println("--------------------------");
		Square s=new Square(10,20);
		Cycle c=new Cycle(5);
		System.out.println("�����ε��ܳ���:"+s.getLength());
		System.out.println("�����ε������:"+s.getSize());
		System.out.println("Բ���ܳ���:"+c.getLength());
		System.out.println("Բ�������:"+c.getSize());
	}
}
