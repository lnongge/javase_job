package com.itheima.job.day03_01;

import com.itheima.job.day03.PermissionDemo;

public class PermissionDemo2 {
	public static void main(String[] args) {
		//��ͬ��д����֮��ķ���(û�м̳й�ϵ)
		//��ǰ��:day03_01,����day03���µ���PermissionDemo(û�м̳й�ϵ)
		PermissionDemo pd=new PermissionDemo();
		pd.publicPermission();
		//pd.defaultPermission();//���ʲ���
		//pd.protectedPermission();//���ʲ���
		//pd.privatePermission();���ʲ���
	}
	public void publicPermission(){
		System.out.println("����day03_01����public���εķ���2");
	}
	void defaultPermission(){
		System.out.println("����day03_01����default���ε�2");
	}
	protected void protectedPermission(){
		System.out.println("����day03_01����protected���ε�2");
	}
	public void privatePermission(){
		System.out.println("����day03_01����private���ε�2");
	}
}
