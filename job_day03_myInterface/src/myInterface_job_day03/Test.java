package myInterface_job_day03;

public class Test {
	/*xmindͼ������ת�͵İ���*/
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		boolean result = d instanceof Dog1;// dָ��Ķ����ǲ���Dog��ʵ��?��
		System.out.println(result);

		Animal1 a = new Dog1();
		boolean result2 = a instanceof Dog1;// aָ��Ķ����ǲ���Dog��ʵ��?��
		System.out.println(result2);

		Animal1 c = new Cat1();
		boolean result3 = c instanceof Dog1;// cָ��Ķ����ǲ���Dog��ʵ��?����
		System.out.println(result3);
	}
}
interface Animal1{
	
}
class Dog1 implements Animal1{
	
}
class Cat1 implements Animal1{
	
}
