package com.itheima.job.day02;

public class ExtendsDemo5 {
	/*this��super�ڹ��췽���е�ʹ��*/
	public static void main(String[] args) {
		Zi z=new Zi();
	}
}
class Fu{
	public Fu(){
		System.out.println("����fu��ղι���");
	}
	public Fu(int a){
		System.out.println("����fu����вι���");
	}
}
class Zi extends Fu{
	public Zi(){
		
		System.out.println("����zi���޲ι���");
	}
	public Zi(int a){
		
		System.out.println("���������вι���");
	}
}