package com.itheima.job_day05;

public class RegexDemo {
	/*�ܹ���д�ж��ַ������Ƿ����Ԫ���ַ�
	 * ԭ����ĸ:a e i o u ��A E I O U*/
	public static void main(String[] args) {
		String str="qeq".toLowerCase();//���Ȱ��ַ���ȫת��Сд�Ͳ����жϴ�д�������
		boolean f=str.matches(".[aeiou].");
		System.out.println(f);
	}
}
