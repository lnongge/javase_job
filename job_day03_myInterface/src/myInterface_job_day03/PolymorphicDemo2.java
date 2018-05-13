package myInterface_job_day03;

public class PolymorphicDemo2 {
	/*多态类型转换:向上转型和像下转型*/
	public static void main(String[] args) {
		Animal3 d=new Dog3();
		//System.out.println(d.num);//访问成员变量
		d.eat();//访问的是狗类中重写的eat()
		//d.swimming();//无法通过,编译时看的是左边,Animal3中无swiming方法,那咋办?我就想访问狗特有的方法----强转
		Dog3 d1=(Dog3)d;
		d1.swimming();//访问狗类特有的方法
	}
}
class Animal3{
	//int num=20;
	public void eat(){
		System.out.println("动物吃饭");
	}
}
class Dog3 extends Animal3{
	//int num=10;
	@Override
	public void eat(){
		System.out.println("狗啃骨头");
	}
	//狗类中特有的方法
	public void swimming(){
		System.out.println("狗会狗刨");
	}
}