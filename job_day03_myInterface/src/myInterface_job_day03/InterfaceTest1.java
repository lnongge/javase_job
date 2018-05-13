package myInterface_job_day03;

public class InterfaceTest1 {
	/*�����˶�Ա�ͽ���
	ƹ�����˶�Ա�ͽ���
	���������˶�Ա�ͽ���Ҫ��������,��ҪѧϰӢ��
	���������ѧ��֪ʶ,����������Щ����,��Щ�ǳ�����,��Щ�ǽӿ�*/
	public static void main(String[] args) {
		BasketballPlayer bp=new BasketballPlayer();
		bp.setName("Ҧ��");
		bp.setAge(23);
		bp.eat();
		bp.learn();
		bp.speakEnglish();
		bp.sleep();
		BasketballCoach bc=new BasketballCoach();
		bc.setName("��ƽ��������");
		bc.setAge(60);
		bc.eat();
		bc.teach();
		bc.speakEnglish();
		bc.sleep();
		PingPangPlayer ppp=new PingPangPlayer();
		ppp.setName("�ż̿�");
		ppp.setAge(25);
		ppp.eat();
		ppp.learn();
		ppp.sleep();
		PingPangCoach ppc=new PingPangCoach();
		ppc.setName("������");
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
		System.out.println(name+"�Է�...");
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
		System.out.println(getName()+"ѧϰ����...");
	}
	
}
class BasketballPlayer extends Player implements English{
	public void learn(){
		System.out.println(getName()+"ѧϰͶ��...");
	}
	@Override
	public void speakEnglish() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"˵Ӣ��......");
	}
}

class PingPangCoach extends Coach{
	public void teach(){
		System.out.println(getName()+"�̳���...");
	}
}
class BasketballCoach extends Coach implements English{
	public void teach(){
		System.out.println(getName()+"��Ͷ��...");
	}
	public void speakEnglish(){
		System.out.println(getName()+"˵Ӣ��......");
	}
}