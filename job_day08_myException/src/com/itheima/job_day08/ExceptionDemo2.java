package com.itheima.job_day08;

public class ExceptionDemo2 {
	/*try...catch..catch*/
	public static void main(String[] args) {
		try {
			//������ָ���쳣
			String s=null;
			System.out.println(s.length());
			//���������쳣
			int i=10/0;
			//������������Խ���쳣
			int[] arr=new int[1];
			System.out.println(arr[1]);
		} catch (NullPointerException e) {
			System.out.println("���ֿ�ָ����");
		}catch(ArithmeticException e){
			System.out.println("���������쳣��");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("��������Խ����");
		}catch(Exception e){
		System.out.println("������");
	}
	}
}
