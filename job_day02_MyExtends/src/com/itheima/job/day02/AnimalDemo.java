package com.itheima.job.day02;

public class AnimalDemo {
	/*������*/
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		Cat c=new Cat();
		c.eat();
	}
}
abstract class Animal{
	//abstract void eat();
	public void eat(){
		System.out.println("��...");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("����shit");
		
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
}
