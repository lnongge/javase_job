package com.itheima.job.day03_02;

public class InnerDemo2 {
	public static void main(String[] args) {
		Outer2 o=new Outer2();
		o.method();
		/*Outer2.Inner i= o.new Inner();
		i.function();*/
		
		//��̬�����ڲ���
		Outer2.Inner i=new Outer2.Inner();
		i.function();
		i.function1();//ͨ���ڲ����������ڲ��ྲ̬����
		Outer2.Inner.function1();//ͨ���ڲ�������ֱ�ӵ����ڲ��ྲ̬����
	}
}	
class Outer2{//�������Outer��ûд���η�������default,����public?Ӧ����
	int num=10;
	public void method(){
		System.out.println("Outer2�ĳ�Ա����");
	}
	/*class Inner{
		public void function(){
			System.out.println("Outer2���ڲ���Inner2");
		}
	}*/
	
	//��̬�����ڲ���
	static class Inner{
		public void function(){
			System.out.println("Outer2���ڲ���Inner2");
		}
		public static void function1(){
			System.out.println("Outer2���ڲ���Inner2�ķ���2");
		}
	}
}