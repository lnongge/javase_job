package com.itheima.job.homework_day03;

public class Test4 {
	/*第四题：分析以下需求，并用代码实现
	要求:在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现 
	方式1：	创建InterA实现类，重写showA，方法中打印“第一种方式”
			测试类中创建A类对象，调用methodA方法，参数传递InterA实现类对象
	方式2： 测试类中创建A类对象，调用methodA方法，参数传递InterA实现类对象(使用匿名内部类实现，showA方法中打印“第二种方式”)
	public class Test {
		public static void main(String[] args) {		
			//补齐代码
		}
	}
	//定义接口
	interface InterA {
		void showA();	
	}
	class A {
		public void methodA(InterA a) {
			a.showA();		
		}	
	}*/
	public static void main(String[] args) {
		/*InterAImpl iImpl=new InterAImpl();
		iImpl.show();*/
		A a=new A();
		//方式1
		a.methodA(new InterAImpl());
		//方式2
		a.methodA(
				new InterA(){
					public void show(){
						System.out.println("第二种方式");
					}
				}
				);
		
	}
}
