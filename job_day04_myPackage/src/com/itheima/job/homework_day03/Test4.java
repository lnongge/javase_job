package com.itheima.job.homework_day03;

public class Test4 {
	/*�����⣺�����������󣬲��ô���ʵ��
	Ҫ��:�ڲ�����Test�д���A�Ķ���a�����ó�Ա����methodA(),Ҫ�������ַ�ʽʵ�� 
	��ʽ1��	����InterAʵ���࣬��дshowA�������д�ӡ����һ�ַ�ʽ��
			�������д���A����󣬵���methodA��������������InterAʵ�������
	��ʽ2�� �������д���A����󣬵���methodA��������������InterAʵ�������(ʹ�������ڲ���ʵ�֣�showA�����д�ӡ���ڶ��ַ�ʽ��)
	public class Test {
		public static void main(String[] args) {		
			//�������
		}
	}
	//����ӿ�
	interface InterA {
		void showA();	
	}
	class A {
		public void methodA(InterA a) {
			a.showA();		
		}	
	}*/
	public static void main(String[] args) {
		/*InterAImpl iImpl=new InterAImpl();
		iImpl.show();*/
		A a=new A();
		//��ʽ1
		a.methodA(new InterAImpl());
		//��ʽ2
		a.methodA(
				new InterA(){
					public void show(){
						System.out.println("�ڶ��ַ�ʽ");
					}
				}
				);
		
	}
}
