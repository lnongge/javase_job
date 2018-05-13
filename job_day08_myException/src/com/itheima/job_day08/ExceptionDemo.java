package com.itheima.job_day08;

public class ExceptionDemo {
	/*try...catch处理零异常*/
	public static void main(String[] args) {
		/*一旦产生异常,jvm就会为异常创建一个新线程,故此时就是多线程,所以产生的异常后面的语句,执行顺序不固定,看谁先抢到线程,谁就先执行
		 * 下面的代码(1)处产生异常,由此变为多线程
		 * 故(2)(3)(4)及(4后面的语句)执行顺序不固定,
		 *而只有到异常线程结束后才又变单线程(这个由系统决定)
		 * */
		try {
			System.out.println("---1--");
			int i=10/0;//除以0产生一个算术异常(1)
			System.out.println("---2--");
		} catch (Exception e) {//Exception e=new ArithmeticException多态
			e.printStackTrace();//(2)--
			//e.toString()打印异常的类+原因,e.getMessage()打印异常原因
			//e.printStackTrace();打印异常的类名+原因+出现的位置
			System.out.println("出现异常了");//(3)
		}
		System.out.println("---3--");//(4)
		System.out.println("---4--");
		
	}
}
