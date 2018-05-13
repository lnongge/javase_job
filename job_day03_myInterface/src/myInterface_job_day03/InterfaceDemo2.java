package myInterface_job_day03;

public class InterfaceDemo2 {
	/*类与接口关系:实现
	 *接口与接口关系:多继承
	 * */
	public static void main(String[] args) {
		
	}
	
}
interface A{
	void method();
}
interface B{
	void method();
	void method(int num);
	//int method();不是方法的重载,
}
interface c extends A,B{
	void function();
}
class CImpl implements c{

	@Override
	public void method() {
		
	}

	@Override
	public void function() {
		
	}

	@Override
	public void method(int num) {
		// TODO Auto-generated method stub
		
	}
	
}