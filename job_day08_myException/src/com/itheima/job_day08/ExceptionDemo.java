package com.itheima.job_day08;

public class ExceptionDemo {
	/*try...catch�������쳣*/
	public static void main(String[] args) {
		/*һ�������쳣,jvm�ͻ�Ϊ�쳣����һ�����߳�,�ʴ�ʱ���Ƕ��߳�,���Բ������쳣��������,ִ��˳�򲻹̶�,��˭�������߳�,˭����ִ��
		 * ����Ĵ���(1)�������쳣,�ɴ˱�Ϊ���߳�
		 * ��(2)(3)(4)��(4��������)ִ��˳�򲻹̶�,
		 *��ֻ�е��쳣�߳̽�������ֱ䵥�߳�(�����ϵͳ����)
		 * */
		try {
			System.out.println("---1--");
			int i=10/0;//����0����һ�������쳣(1)
			System.out.println("---2--");
		} catch (Exception e) {//Exception e=new ArithmeticException��̬
			e.printStackTrace();//(2)--
			//e.toString()��ӡ�쳣����+ԭ��,e.getMessage()��ӡ�쳣ԭ��
			//e.printStackTrace();��ӡ�쳣������+ԭ��+���ֵ�λ��
			System.out.println("�����쳣��");//(3)
		}
		System.out.println("---3--");//(4)
		System.out.println("---4--");
		
	}
}
