package com.itheima.job.homework_day03;

public class Test1 {
	/*��һ��:������������,���ô���ʵ��
	1.�ӿ�IPlay����һ������playGame()���ڲ���������ε��ø÷�����ʹ���������ַ�ʽ���ã�
		��ʽ1����������ʵ�ֽӿڵķ�ʽʵ��(ͨ��ʵ���������÷���)
		��ʽ2���������ڲ���ʵ��

	2.һ��������Fun����һ�����󷽷� fun() , �ڲ���������ε��ø÷���? ʹ���������ַ�ʽ���ã�
		��ʽ1����������̳г�����ķ�ʽʵ��(ͨ�����������÷���)
		��ʽ2���������ڲ���ʵ��*/
	

	public static void main(String[] args) {
		//1-��ʽ1��������ʵ�ֽӿڵķ�ʽʵ��(ͨ��ʵ���������÷���)
		Phone p=new Phone();
		p.playGame();
		//1-��ʽ2�������ڲ���ʵ��
		new IPlay(){
			public void playGame(){
				System.out.println("����Ϸ2.0...");
			}
		}.playGame();
		//2-��ʽ1
		FunSon fs=new FunSon();
		fs.fun();
		//2-��ʽ2
		new Fun(){
			public void fun(){
				System.out.println("fun2.0...");
			}
		}.fun();
	}
}
interface IPlay{
	public void playGame();
}
class Phone implements IPlay{

	@Override
	public void playGame() {
		System.out.println("����Ϸ");
	}
	
}
//�ڶ�С��
abstract class Fun{
	public abstract void fun();
}
//��һ�ַ���
 class FunSon extends Fun{

	@Override
	public void fun() {
		System.out.println("fun������");
	}
	
}