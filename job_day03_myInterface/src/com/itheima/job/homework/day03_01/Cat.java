package com.itheima.job.homework.day03_01;

public class Cat extends Animal{
	
	public Cat() {
		super();
	}
	public Cat(int age, String color) {
		super(age, color);
	}
	@Override
	public void eat(String food) {
		System.out.println(getAge()+"���"+getColor()+"��ɫ��è�����۾�����ͷ��"+food);
	}
	public void catchMouse(){
		System.out.println("èץ����");
	}
}
