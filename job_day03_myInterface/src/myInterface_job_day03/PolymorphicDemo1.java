package myInterface_job_day03;

public class PolymorphicDemo1 {
	/*��̬��Ա�������ص�*/
	public static void main(String[] args) {
		//��ͨ��ʽ���óԷ�����
		Cat2 c=new Cat2();
		c.eat();
		//��̬��ʽ���óԷ�����
		Animal2 a=new Cat2();
		a.eat();
	}
}
class Animal2{
	public void eat(){
		System.out.println("�Զ���");
		
	}
}
class Cat2 extends Animal2{
	public void eat(){
		System.out.println("è����");
	}
}