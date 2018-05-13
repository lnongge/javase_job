package com.itheima.job_day08;

public class ExceptionDemo2 {
	/*try...catch..catch*/
	public static void main(String[] args) {
		try {
			//产生空指针异常
			String s=null;
			System.out.println(s.length());
			//产生算术异常
			int i=10/0;
			//产生数组索引越界异常
			int[] arr=new int[1];
			System.out.println(arr[1]);
		} catch (NullPointerException e) {
			System.out.println("出现空指针了");
		}catch(ArithmeticException e){
			System.out.println("出现算术异常了");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组索引越界了");
		}catch(Exception e){
		System.out.println("出错了");
	}
	}
}
