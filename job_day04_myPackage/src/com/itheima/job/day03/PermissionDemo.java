package com.itheima.job.day03;
//import com.itheima.job.day03_02.Cat;;
public class PermissionDemo {
	public static void main(String[] args) {
		PermissionDemo pd=new PermissionDemo();//这里为什么要创建对象调用?因为这些方法是非静态,不是静态的方法只能创建对象访问
		pd.publicPermission();
		pd.defaultPermission();
		pd.protectedPermission();
		pd.privatePermission();
		
	}
	public void publicPermission(){
		System.out.println("我是day03包下public修饰的方法");
	}
	void defaultPermission(){
		System.out.println("我是day03包下default修饰的");
	}
	protected void protectedPermission(){
		System.out.println("我是day03包下protected修饰的");
	}
	private void privatePermission(){
		System.out.println("我是day03包下private修饰的");
	}
}
