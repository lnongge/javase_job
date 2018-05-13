package com.itheima.job.day02;

public class ExtendsDemo4 {
	/*方法的重写*/
	public static void main(String[] args) {
		NewPhone np=new NewPhone();
		np.call();
	}
}

class Phone{
	public void call(){
		System.out.println("打电话");
	}
}
class NewPhone extends Phone{
	public void call(){
		System.out.println("视频通话");
		super.call();
	}
}