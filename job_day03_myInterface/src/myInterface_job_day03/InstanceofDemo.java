package myInterface_job_day03;

public class InstanceofDemo {
	/**/
	public static void main(String[] args) {
		printFood(new Dog4());
		printFood(new Cat4());
	}
	public static void printFood(Animal4 a){
		a.eat();
		//我要调用Dog4特有的方法如何做?多态没法访问子类特有的成员方法---用强转
		/*Dog4 d=(Dog4)a;
		d.lookDoor();*/
		/*这样当Animal4 a接受一个Dog4对象时没问题,但是Animal子类不只有一个Dog4,当传入其他子类时,没有lookDoor()方法.
		 * 所有要增加一个判断?当传进来的狗,调用的是狗特有的方法,当传进来的是猫,就调用猫特有的方法
		 * */
		//改进做法
		if(a instanceof Dog4){
			Dog4 d=(Dog4)a;
			d.lookDoor();
		}
		if(a instanceof Cat4){
			Cat4 c=(Cat4)a;
			c.play();
		}
	}
}
interface Animal4{
	void eat();
}
class Dog4 implements Animal4{
	@Override
	public void eat(){
		System.out.println("狗啃骨头");
	}
	//狗特有的方法
	public void lookDoor(){
		System.out.println("看门");
	}
}
class Cat4 implements Animal4{
	@Override
	public void eat(){
		System.out.println("猫吃鱼");
	}
	//猫特有的方法
	public void play(){
		System.out.println("猫玩球");
	}
}