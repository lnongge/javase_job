package com.itheima.job.homework.day03_01;

public class Dog extends Animal {
	
	public Dog() {
		super();
	}
	public Dog(int age, String color) {
		super(age, color);
	}
	@Override
	public void eat(String food) {
		System.out.println(getAge()+"���"+getColor()+"��ɫ�Ĺ���ֻǰ�������ı�ס"+food+"�ͳ�");
	}
	public void lookHome(){
		System.out.println("������");
	}
}
