package com.itheima.job.homework.day01;

public class Test5 {
/*
 * 第五题:分析以下需求,并用代码实现
	定义一个工具类(ShapeTool)
		1.需求一:       
			在工具类中定义一个方法(getLength)
				形参:长方形的长和宽
				功能:返回长方形的周长
			在工具类中定义一个方法(getSize)
				形参:长方形的长和宽
				功能:返回长方形的面积
		2.需求二:
			在工具类中定义一个方法(getLength)
				形参:圆的半径
				功能:返回圆的周长
			在工具类中定义一个方法(getSize)
				形参:圆的半径
				功能:返回圆的面积
	定义一个长方形类	
			在长方形的类中定义两个长和宽成员
			在长方形类中定义一个方法(getLength)
				形参:无
				功能:求长方形的周长
			在长方形类中定义一个方法(getSize)
				形参:无
				功能:求长方形的面积
	定义一个圆形类
			在圆形的类中定义半径
			在圆形类中定义一个方法(getLength)
				形参:无
				功能:求圆的周长
			在圆形类中定义一个方法(getSize)
				形参:无
				功能:求圆形形的面积
5.定义测试类,测试以上四个需求
	思考:两种求长方形周长的实现方式哪种更符合面向对象的设计思想?都符合,但工具类更好,因为不用创建对象,节省内存
 * */
	public static void main(String[] args) {
		//用工具类求长方形的周长
		System.out.println("长方形的周长是:"+ShapeTool.getLength(10, 20));
		System.out.println("长方形的面积是:"+ShapeTool.getSize(10, 20));
		System.out.println("圆的周长是:"+ShapeTool.getLength(5));
		System.out.println("圆的面积是:"+ShapeTool.getSize(5));
		
		System.out.println("--------------------------");
		Square s=new Square(10,20);
		Cycle c=new Cycle(5);
		System.out.println("长方形的周长是:"+s.getLength());
		System.out.println("长方形的面积是:"+s.getSize());
		System.out.println("圆的周长是:"+c.getLength());
		System.out.println("圆的面积是:"+c.getSize());
	}
}
