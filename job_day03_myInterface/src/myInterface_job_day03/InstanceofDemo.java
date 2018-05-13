package myInterface_job_day03;

public class InstanceofDemo {
	/**/
	public static void main(String[] args) {
		printFood(new Dog4());
		printFood(new Cat4());
	}
	public static void printFood(Animal4 a){
		a.eat();
		//��Ҫ����Dog4���еķ��������?��̬û�������������еĳ�Ա����---��ǿת
		/*Dog4 d=(Dog4)a;
		d.lookDoor();*/
		/*������Animal4 a����һ��Dog4����ʱû����,����Animal���಻ֻ��һ��Dog4,��������������ʱ,û��lookDoor()����.
		 * ����Ҫ����һ���ж�?���������Ĺ�,���õ��ǹ����еķ���,������������è,�͵���è���еķ���
		 * */
		//�Ľ�����
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
		System.out.println("���й�ͷ");
	}
	//�����еķ���
	public void lookDoor(){
		System.out.println("����");
	}
}
class Cat4 implements Animal4{
	@Override
	public void eat(){
		System.out.println("è����");
	}
	//è���еķ���
	public void play(){
		System.out.println("è����");
	}
}