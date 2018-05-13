package com.itheima.job.homework.day01;

public class ShapeTool {
	//工具类
	private ShapeTool(){}
	//求长方形的周长
	public static int getLength(int len,int wid ){
		return (len+wid)*2;
	}
	//求长方形的面积
	public static int getSize(int len,int wid){
		return len*wid;
	}
	//求圆的周长
	public static double getLength(int radius){
		return 2*Math.PI*radius;
	}
	//求圆的面积
	public static double getSize(int radius){
		return Math.PI*radius*radius;
	}
}
