package com.itheima.job.day03_02;

public class AnonymousInnerDemo2 {
	public static void main(String[] args) {
		/*匿名内部类使用场景:作为方法参数传递*/
		//没有使用内部类做法
		/*useEat(new Dog4());
		useEat(new Cat4());*/
		
		//使用匿名内部类做法---这种情况我Cat4类和Dog4类就不用创建了
		useEat(
				new Animal4(){
					public void eat(){
						System.out.println("猫吃鱼");
					}
				}
				);
		useEat(
				new Animal4(){
					public void eat(){
						System.out.println("狗啃骨头");
					}
				}
				);
		
	}
	public static void useEat(Animal4 a){
		a.eat();
	}
}
interface Animal4{
	public void eat();
}
/*class Cat4 implements Animal4{

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
}
class Dog4 implements Animal4{
	public void eat(){
		System.out.println("狗啃骨头");
	}
}*/