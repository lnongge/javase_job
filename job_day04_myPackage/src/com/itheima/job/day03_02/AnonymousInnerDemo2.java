package com.itheima.job.day03_02;

public class AnonymousInnerDemo2 {
	public static void main(String[] args) {
		/*�����ڲ���ʹ�ó���:��Ϊ������������*/
		//û��ʹ���ڲ�������
		/*useEat(new Dog4());
		useEat(new Cat4());*/
		
		//ʹ�������ڲ�������---���������Cat4���Dog4��Ͳ��ô�����
		useEat(
				new Animal4(){
					public void eat(){
						System.out.println("è����");
					}
				}
				);
		useEat(
				new Animal4(){
					public void eat(){
						System.out.println("���й�ͷ");
					}
				}
				);
		
	}
	public static void useEat(Animal4 a){
		a.eat();
	}
}
interface Animal4{
	public void eat();
}
/*class Cat4 implements Animal4{

	@Override
	public void eat() {
		System.out.println("è����");
	}
	
}
class Dog4 implements Animal4{
	public void eat(){
		System.out.println("���й�ͷ");
	}
}*/