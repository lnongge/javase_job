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
		System.out.print("����Ϊ"+age+"���"+name+"����һֻ"+dog.getColor()+"��ɫ��"+dog.getAge()+"��ĳ���,");
		dog.eat(something);
	}
	public void keepPet(Cat cat,String something){
		System.out.print("����Ϊ"+age+"���"+name+"����һֻ"+cat.getColor()+"��ɫ��"+cat.getAge()+"��ĳ���,");
		cat.eat(something);
	}*/
	//�Ľ�����
	public void KeepPet(Animal a,String something){
		System.out.print("����Ϊ"+age+"���"+name+"����һֻ"+a.getColor()+"��ɫ��"+a.getAge()+"��ĳ���,");
		a.eat(something);
		if(a instanceof Dog){
			//System.out.print("����Ϊ"+age+"���"+name+"����һֻ"+a.getColor()+"��ɫ��"+a.getAge()+"��ĳ���,");
			Dog d=(Dog)a;
			d.lookHome();
		}
		if(a instanceof Cat){
			//System.out.print("����Ϊ"+age+"���"+name+"����һֻ"+a.getColor()+"��ɫ��"+a.getAge()+"��ĳ���,");
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
