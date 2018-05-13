package com.itheima.homework.job_day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 第一题：分析以下需求，并用代码实现
	1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
	2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
 * */
public class Test1 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("请输入出生日期(格式为xxxx-xx-xx):");
			String birthday=sc.nextLine();
			if(birthday.matches("\\d{4}-\\d{2}-\\d{2}")){
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				Date birDate=sdf.parse(birthday);
				Date curDate=new Date();
				long srcD=birDate.getTime();
				long destD=curDate.getTime();
				long result=(destD-srcD)/1000/60/60/24;
				System.out.println("你至今活了"+(result)+"天");
				System.out.println("(一年按365天,一个月30天算)就是"+(result/365)+"年"+(result%365/30)+"月"+(result%365%30)+"天");
				return;
			}else{
				System.out.println("你输入的日期格式有误,请重新收入!");
			}
		}
		
	}
}
