package com.itheima.job.day03_01;

import com.itheima.job.day03.PermissionDemo;

public class PermissionDemo3 extends PermissionDemo {
	//��ͬ��д����֮��ķ���(�м̳й�ϵ)
	public static void main(String[] args) {
		PermissionDemo pd=new PermissionDemo();
		pd.publicPermission();
		//pd.defaultPermission();
		//pd.privatePermission();
		//pd.protectedPermission();
		/*
		 * ����Ϊʲô�޷�����day03����protectedȨ�޵ķ���protectedPermission()?
		 * ��ΪprotectedȨ����������Դ�ȡ����
		 * */
		PermissionDemo3 pd3=new PermissionDemo3();
		pd3.publicPermission();
		pd3.protectedPermission();
		//������Է��ʵ�����������ַ���,����û����.
	}
}
