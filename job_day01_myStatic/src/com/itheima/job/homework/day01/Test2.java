package com.itheima.job.homework.day01;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	/*
	 * 第二题:分析以下需求,并用代码实现 猜数字小游戏: 
	 * 1.系统产生一个随机数1~100之间的。 2.键盘录入我们要猜的数据
	 * 3.比较这两个数据(用if语句) 
	 * 	大了：给出提示大了 
	 * 	小了：给出提示小了 
	 * 	猜中了：给出提示，恭喜你，猜中了 
	 * 4.一直猜,直到猜对为止
	 */
	public static void main(String[] args) {
		Random r=new Random();
		int num=r.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("请输入猜的数:");
			int guessNum=sc.nextInt();
			if(guessNum==num){
				System.out.println("恭喜你,猜中了");
				break;
			}else if(guessNum>num){
				System.out.println("大了");
			}else{
				System.out.println("小了");
			}
		}
		
	}
}
