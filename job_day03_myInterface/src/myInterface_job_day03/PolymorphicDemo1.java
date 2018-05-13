package myInterface_job_day03;

public class PolymorphicDemo1 {
	/*多态成员方法的特点*/
	public static void main(String[] args) {
		//普通方式调用吃饭方法
		Cat2 c=new Cat2();
		c.eat();
		//多态方式调用吃饭方法
		Animal2 a=new Cat2();
		a.eat();
	}
}
class Animal2{
	public void eat(){
		System.out.println("吃东西");
		
	}
}
class Cat2 extends Animal2{
	public void eat(){
		System.out.println("猫吃鱼");
	}
}