package com.itheima.job.day01;
public class BlockTest {/*�����ִ��˳��*/
	static{
		System.out.println("����BlockTest�ľ�̬�����");//1
	}
	{
		System.out.println("����BlockTest�Ĺ�������");//6
	}
	public static void main(String[] args) {
		//System.out.println("����BlockTest���main����ִ��");//2
		Coder c=new Coder();
		BlockTest bt=new BlockTest();
		
	}
}
/* һ��java�ļ��п����ж����,����ֻ����һ����public����.
 * ע:���Coder����BlockTest���ǲ��й�ϵ,�����ڲ���(��Coder�����BlockTest���{}�ڲ����ڲ���),
 * Coder������Ƕ�������,Ч���뵥��д����һ��.java�ļ��е���һ��
 * 	1����������ڴ���һ��Coder.java��,�ᱨ����ͬ����
 * */
class Coder{
	static {
		System.out.println("����Coder��ľ�̬�����");// 3
	}
	{
		System.out.println("����Codr��Ĺ�������");//4
	}
	public Coder(){
		System.out.println("����Coder�Ĺ��췽��ִ��");//5
	}
}