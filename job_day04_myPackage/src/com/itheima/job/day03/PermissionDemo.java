package com.itheima.job.day03;
//import com.itheima.job.day03_02.Cat;;
public class PermissionDemo {
	public static void main(String[] args) {
		PermissionDemo pd=new PermissionDemo();//����ΪʲôҪ�����������?��Ϊ��Щ�����ǷǾ�̬,���Ǿ�̬�ķ���ֻ�ܴ����������
		pd.publicPermission();
		pd.defaultPermission();
		pd.protectedPermission();
		pd.privatePermission();
		
	}
	public void publicPermission(){
		System.out.println("����day03����public���εķ���");
	}
	void defaultPermission(){
		System.out.println("����day03����default���ε�");
	}
	protected void protectedPermission(){
		System.out.println("����day03����protected���ε�");
	}
	private void privatePermission(){
		System.out.println("����day03����private���ε�");
	}
}
