package com.itheima.job.homework.day01;

public class Test4 {
	/*
	 * �����⣺�����������󣬲��ô���ʵ�� Ҫ��:��ɴ���(���ձ�׼��ʽд)��Ȼ���ڲ������в��ԡ�
	 *  1.��Ŀ������ ���ԣ����� ���� ���� ���� ��Ϊ������work
	 *  2.����Ա�� ���ԣ����� ���� ���� ��Ϊ������work 
	 *  3.������ �ֱ𴴽����������ͳ���Ա����,���ö�����ø��Եķ���
	 */
	public static void main(String[] args) {
		Manager m=new Manager("����Ⱥ","m001",1000,500);
		m.work();
		Coder c=new Coder("�����","c001",10000,5000);
		c.work();
	}
}
