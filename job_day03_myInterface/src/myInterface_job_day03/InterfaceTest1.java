package myInterface_job_day03;

public class InterfaceTest1 {
	/*篮球运动员和教练
	乒乓球运动员和教练
	现在篮球运动员和教练要出国访问,需要学习英语
	请根据你所学的知识,分析出来哪些是类,哪些是抽象类,哪些是接口*/
	public static void main(String[] args) {
		BasketballPlayer bp=new BasketballPlayer();
		bp.setName("姚明");
		bp.setAge(23);
		bp.eat();
		bp.learn();
		bp.speakEnglish();
		bp.sleep();
		BasketballCoach bc=new BasketballCoach();
		bc.setName("卫平布莱恩特");
		bc.setAge(60);
		bc.eat();
		bc.teach();
		bc.speakEnglish();
		bc.sleep();
		PingPangPlayer ppp=new PingPangPlayer();
		ppp.setName("张继科");
		ppp.setAge(25);
		ppp.eat();
		ppp.learn();
		ppp.sleep();
		PingPangCoach ppc=new PingPangCoach();
		ppc.setName("刘胖子");
		ppc.setAge(45);
		ppc.eat();
		ppc.teach();
		ppc.sleep();
	}
}	
class Person{
	private String name;
	private int age;
	public void eat(){
		System.out.println(name+"吃饭...");
	}
	public void sleep(){
		System.out.println(name+"Zzz...");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}

abstract class Coach extends Person{
	abstract void teach();
}
abstract class Player extends Person{
	abstract void learn();
}
interface English{
	void speakEnglish();
}
class PingPangPlayer extends Player {
	public void learn(){
		System.out.println(getName()+"学习抽球...");
	}
	
}
class BasketballPlayer extends Player implements English{
	public void learn(){
		System.out.println(getName()+"学习投篮...");
	}
	@Override
	public void speakEnglish() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"说英语......");
	}
}

class PingPangCoach extends Coach{
	public void teach(){
		System.out.println(getName()+"教抽球...");
	}
}
class BasketballCoach extends Coach implements English{
	public void teach(){
		System.out.println(getName()+"教投篮...");
	}
	public void speakEnglish(){
		System.out.println(getName()+"说英语......");
	}
}