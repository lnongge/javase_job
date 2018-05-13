package myInterface_job_day03;

public class InterfaceDemo1 {
	/*定义一个Animal接口
	   	属性:num值为10
	   	方法:吃饭方法
		定义一个接口实现类Cat
		定义一个测试类获取num的值并打印
		*/
	public static void main(String[] args) {
		/*这里我为了方便直接写在一个.java文件中*/
		Animal a=new Cat();
		System.out.println(a.num);
		a.eat();
	}
}
//接口
interface Animal{
	int num=10;
	void eat();
}
class Cat implements Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
}
