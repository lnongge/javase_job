package myInterface_job_day03;

public class InterfaceDemo2 {
	/*����ӿڹ�ϵ:ʵ��
	 *�ӿ���ӿڹ�ϵ:��̳�
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
	//int method();���Ƿ���������,
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