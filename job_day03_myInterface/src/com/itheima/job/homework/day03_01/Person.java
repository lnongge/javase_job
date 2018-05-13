package com.itheima.job.homework.day03_01;

public class Person {
	private String name;
	private int age;
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*public void keepPet(Dog dog,String something){
		System.out.print("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的宠物,");
		dog.eat(something);
	}
	public void keepPet(Cat cat,String something){
		System.out.print("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的宠物,");
		cat.eat(something);
	}*/
	//改进做法
	public void KeepPet(Animal a,String something){
		System.out.print("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的宠物,");
		a.eat(something);
		if(a instanceof Dog){
			//System.out.print("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的宠物,");
			Dog d=(Dog)a;
			d.lookHome();
		}
		if(a instanceof Cat){
			//System.out.print("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的宠物,");
			Cat c=(Cat)a;
			c.catchMouse();
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
