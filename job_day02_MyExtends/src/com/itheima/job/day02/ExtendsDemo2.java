package com.itheima.job.day02;

public class ExtendsDemo2 {
	/*�̳��г�Ա�����ķ���*/
	public static void main(String[] args) {
		Kid k=new Kid();
		k.show();
	}
}
class Dad{
	String name="������";
}
class Kid extends Dad{
	String name="��˼��";
	public void show(){
		String name="�����";
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(name);
	}
}
