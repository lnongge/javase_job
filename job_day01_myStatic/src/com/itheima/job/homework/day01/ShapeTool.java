package com.itheima.job.homework.day01;

public class ShapeTool {
	//������
	private ShapeTool(){}
	//�󳤷��ε��ܳ�
	public static int getLength(int len,int wid ){
		return (len+wid)*2;
	}
	//�󳤷��ε����
	public static int getSize(int len,int wid){
		return len*wid;
	}
	//��Բ���ܳ�
	public static double getLength(int radius){
		return 2*Math.PI*radius;
	}
	//��Բ�����
	public static double getSize(int radius){
		return Math.PI*radius*radius;
	}
}
