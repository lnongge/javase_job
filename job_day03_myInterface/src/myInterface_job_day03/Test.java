package myInterface_job_day03;

public class Test {
	/*xmind图中向下转型的案例*/
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		boolean result = d instanceof Dog1;// d指向的对象是不是Dog的实例?是
		System.out.println(result);

		Animal1 a = new Dog1();
		boolean result2 = a instanceof Dog1;// a指向的对象是不是Dog的实例?是
		System.out.println(result2);

		Animal1 c = new Cat1();
		boolean result3 = c instanceof Dog1;// c指向的对象是不是Dog的实例?不是
		System.out.println(result3);
	}
}
interface Animal1{
	
}
class Dog1 implements Animal1{
	
}
class Cat1 implements Animal1{
	
}
