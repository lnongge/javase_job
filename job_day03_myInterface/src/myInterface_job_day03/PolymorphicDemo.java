package myInterface_job_day03;

public class PolymorphicDemo {
	/*����һ����Dad
	   	����:��˽�е�num����
	   	����:method()��function()��̬����
	            ���������м򵥵�������
		����һ��Dad������Kid
	   	����:��˽�е�num����
	   	����:method()��function()��̬����
	            ���������м򵥵�������
		����һ��������,���Զ�̬��Ա���ص�*/
	public static void main(String[] args) {
		Dad d=new Kid();
		System.out.println(d.num);//num�ǳ�Ա����,ִ��ʱ�����,�������Dad�е�num
		d.method();//method�ǳ�Ա����,ִ��ʱ�������ұ�,ִ�е���Kid�е�method()����
		d.function();//ʹ�ñ���ȥ���þ�̬��������ʵ�൱���ñ������͵�����ȥ����
		//function�Ǿ�̬����,ִ��ʱ����Ҳ�����,�ʵ��õ���Dad�е�function()����
	}
}
class Dad{
	int num=20;
	public void method(){
		System.out.println("���Ǹ���ĳ�Ա����");
	}
	public static void function(){
		System.out.println("���Ǹ���ľ�̬����");
	}
}
class Kid extends Dad{
	int num=10;
	public void method(){
		System.out.println("��������ĳ�Ա����");
	}
	public static void function(){
		System.out.println("��������ľ�̬����");
	}
}