package myInterface_job_day03;

public class PolymorphicDemo2 {
	/*��̬����ת��:����ת�ͺ�����ת��*/
	public static void main(String[] args) {
		Animal3 d=new Dog3();
		//System.out.println(d.num);//���ʳ�Ա����
		d.eat();//���ʵ��ǹ�������д��eat()
		//d.swimming();//�޷�ͨ��,����ʱ���������,Animal3����swiming����,��զ��?�Ҿ�����ʹ����еķ���----ǿת
		Dog3 d1=(Dog3)d;
		d1.swimming();//���ʹ������еķ���
	}
}
class Animal3{
	//int num=20;
	public void eat(){
		System.out.println("����Է�");
	}
}
class Dog3 extends Animal3{
	//int num=10;
	@Override
	public void eat(){
		System.out.println("���й�ͷ");
	}
	//���������еķ���
	public void swimming(){
		System.out.println("���ṷ��");
	}
}