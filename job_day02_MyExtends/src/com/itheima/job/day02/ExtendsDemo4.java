package com.itheima.job.day02;

public class ExtendsDemo4 {
	/*��������д*/
	public static void main(String[] args) {
		NewPhone np=new NewPhone();
		np.call();
	}
}

class Phone{
	public void call(){
		System.out.println("��绰");
	}
}
class NewPhone extends Phone{
	public void call(){
		System.out.println("��Ƶͨ��");
		super.call();
	}
}