package com.itheima.job.day03_01;

import com.itheima.job.day03.PermissionDemo;

public class PermissionDemo3 extends PermissionDemo {
	//不同包写的类之间的访问(有继承关系)
	public static void main(String[] args) {
		PermissionDemo pd=new PermissionDemo();
		pd.publicPermission();
		//pd.defaultPermission();
		//pd.privatePermission();
		//pd.protectedPermission();
		/*
		 * 这里为什么无法访问day03包下protected权限的方法protectedPermission()?
		 * 因为protected权限是子类可以存取父类
		 * */
		PermissionDemo3 pd3=new PermissionDemo3();
		pd3.publicPermission();
		pd3.protectedPermission();
		//子类可以访问到父类的这两种方法,其他没有了.
	}
}
