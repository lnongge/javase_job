package com.itheima.homework.job_day05;

public class Test3 {
	/*
	 * �����⣺�����������󣬲��ô���ʵ��
  	(��������дƥ���ֻ��ź������������ʽ)
	1.��������д��������ʽ
		(1)�ֻ�������:
			��һλΪ1
			�ڶ�λΪ3��4��5��7��8
			����~ʮһλΪ0~9������һ������
		(2)��������:��@�ֽ�
			@ �������Ϊ��������ĸ������
			@ �����ұ�Ϊ��������ĸ������+�����+��������ĸ������

	2.����������ʽ�����������:
		(1)�ж��ֻ���"11600014387"�Ƿ�����ֻ��ĸ�ʽ
		(2)����һ�����������ַ�������{"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"}
		����������ʽ���˳����е�����,��ӡ��ȷ������
	 * */
	public static void main(String[] args) {
		//�����ֻ���11600014387
		String phoneNum="11600014387";
		if(phoneNum.matches("1[34578]\\d{9}")){
			System.out.println("�ֻ���"+phoneNum+"�����ֻ���ʽ");
		}else{
			System.out.println("�ֻ���"+phoneNum+"�������ֻ���ʽ");
		}
		//��������
		String[] strs={"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"};
		for(int i=0;i<strs.length;i++){
			String s=strs[i];
			if(s.matches("\\w+@\\w+(\\.\\w+)+")){
				System.out.println(strs[i]);
			}
		}
		
	}
}
