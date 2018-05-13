package com.itheima.job.day03_01;

import com.itheima.job.day03.PermissionDemo;

public class PermissionDemo2 {
	public static void main(String[] args) {
		//不同包写的类之间的访问(没有继承关系)
		//当前包:day03_01,访问day03包下的类PermissionDemo(没有继承关系)
		PermissionDemo pd=new PermissionDemo();
		pd.publicPermission();
		//pd.defaultPermission();//访问不到
		//pd.protectedPermission();//访问不到
		//pd.privatePermission();访问不到
	}
	public void publicPermission(){
		System.out.println("我是day03_01包下public修饰的方法2");
	}
	void defaultPermission(){
		System.out.println("我是day03_01包下default修饰的2");
	}
	protected void protectedPermission(){
		System.out.println("我是day03_01包下protected修饰的2");
	}
	public void privatePermission(){
		System.out.println("我是day03_01包下private修饰的2");
	}
}
