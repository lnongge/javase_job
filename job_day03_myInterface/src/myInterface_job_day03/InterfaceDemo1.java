package myInterface_job_day03;

public class InterfaceDemo1 {
	/*����һ��Animal�ӿ�
	   	����:numֵΪ10
	   	����:�Է�����
		����һ���ӿ�ʵ����Cat
		����һ���������ȡnum��ֵ����ӡ
		*/
	public static void main(String[] args) {
		/*������Ϊ�˷���ֱ��д��һ��.java�ļ���*/
		Animal a=new Cat();
		System.out.println(a.num);
		a.eat();
	}
}
//�ӿ�
interface Animal{
	int num=10;
	void eat();
}
class Cat implements Animal{
	public void eat(){
		System.out.println("è����");
	}
}
