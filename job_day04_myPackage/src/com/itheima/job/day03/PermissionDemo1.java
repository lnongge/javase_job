package com.itheima.job.day03;

public class PermissionDemo1 {
	public static void main(String[] args) {
		/*相同包下的不同类之间访问*/
		PermissionDemo pd=new PermissionDemo();
		pd.publicPermission();
		pd.defaultPermission();
		pd.protectedPermission();
		//pd.privatePermission();//访问不到
	}
}
