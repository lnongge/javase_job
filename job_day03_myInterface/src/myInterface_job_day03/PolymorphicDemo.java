package myInterface_job_day03;

public class PolymorphicDemo {
	/*定义一个类Dad
	   	属性:非私有的num属性
	   	方法:method()和function()静态方法
	            两个方法中简单的输出语句
		定义一个Dad的子类Kid
	   	属性:非私有的num属性
	   	方法:method()和function()静态方法
	            两个方法中简单的输出语句
		定义一个测试类,测试多态成员的特点*/
	public static void main(String[] args) {
		Dad d=new Kid();
		System.out.println(d.num);//num是成员变量,执行时看左边,输出的是Dad中的num
		d.method();//method是成员方法,执行时看的是右边,执行的是Kid中的method()方法
		d.function();//使用变量去调用静态方法，其实相当于用变量类型的类名去调用
		//function是静态方法,执行时看的也是左边,故调用的是Dad中的function()方法
	}
}
class Dad{
	int num=20;
	public void method(){
		System.out.println("我是父类的成员方法");
	}
	public static void function(){
		System.out.println("我是父类的静态方法");
	}
}
class Kid extends Dad{
	int num=10;
	public void method(){
		System.out.println("我是子类的成员方法");
	}
	public static void function(){
		System.out.println("我是子类的静态方法");
	}
}