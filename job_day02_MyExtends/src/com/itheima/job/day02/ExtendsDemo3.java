package com.itheima.job.day02;

public class ExtendsDemo3 {
	/*�̳��г�Ա�����ķ���*/
	public static void main(String[] args) {
		Kid3 k=new Kid3();
		k.eat();
	}
}
class Dad3{
	public void eat(){
		System.out.println("С������");
		System.out.println("�ȸ���,ȥ˯��");
	}
}
class Kid3 extends Dad3{
	public void eat(){
		System.out.println("�úóԷ�,��쳤��");
	}
}
