package com.itheima.homework.job_day08;

public class Test3 {
	/*	����������(�ӵ����ʼ,ÿһ���ֵ����ǰ������ֵ�ĺ�):
		��һ��: 1
		�ڶ���: 1
		������: 2
		������: 3
		������: 5
		������: 8
		������: 13
		�ڰ���: 21
		�ھ���: 33
		//....
		���õݹ�����20���Ƕ���?*/
	public static void main(String[] args) {
		int n=20;
		int nNum=nNum(n);
		System.out.println("��"+n+"����:"+nNum);
	}

	private static int nNum(int n) {
		if(n==1||n==2)
			return 1;
		return nNum(n-1)+nNum(n-2);
	}
	
}
