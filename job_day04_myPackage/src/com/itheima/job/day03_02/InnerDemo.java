package com.itheima.job.day03_02;

public class InnerDemo {
	//��Ա�ڲ��������ʹ��
	public static void main(String[] args) {
		Outer o=new Outer();
		o.show();
		//Outer.Inner oi=new Outer.Inner();
		/*���:Outer.Inner---���߱�����,����Inner����Outer����.
		 * 	ע:�����ʽ�Ǹ����ʰ��е���һ��,���ǲ����Ƿ��ʰ��е���.������Outer.Inner oi=new Outer.Inner()���ַ�ʽ�����ڲ����޷��ɹ�
		 *�ұ�:new Outer().new Inner()---��Ϊ�ڲ������ⲿ����,������Ҫ�ȴ����ⲿ�����,Ȼ�����ⲿ�������ȥ�����ڲ������,������ڲ������ȡ�����ڲ���ķ��� 
		 * �ܽ�:�����ڲ����������ȴ����ⲿ�����
		 * */
		Outer.Inner oi=new Outer().new Inner();
		//��䴴���ڲ���ķ�ʽ����:Outer.Inner oi=o.new Inner();
		//�������䴴�������Ķ���һ��,��Ϊһ���Ƕ���new Outer()���ڲ���һ���Ƕ���O���ڲ���
		oi.function();
		
	}
}
class Outer{
	private int num=10;
	public void show(){
		System.out.println("����Outer��Ա����");
	}
	class Inner{//��Ա�ڲ���
		public void function(){
			System.out.println("����Inner��Ա����,�ҿ���ȡ��Outer��˽�г�Ա����num="+num);
		}
	}
}