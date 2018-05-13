package Xmind;
/*Xmind内部类*/
public class Test {
	public static void main(String[] args) {
		Outer.Inner oi=new Outer().new Inner();
		oi.show();
	}
}
class Outer{
	int num=10;
	
	class Inner{
		
		int num=20;
		
		public void show(){
			int num=30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(new Outer().num);
			System.out.println(Outer.this.num);//输出的是什么?10
		}
	}
}
