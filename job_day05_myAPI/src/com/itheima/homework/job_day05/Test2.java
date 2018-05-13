package com.itheima.homework.job_day05;

import java.util.Calendar;

public class Test2 {
/*第二题：分析以下需求，并用代码实现
	要求:利用Calendar类的方法判断当前年是闰年还是平年
	提示:
	闰年:二月有29天
	提示：将日期设置为3月1号,然后倒退1天至2月底,求出2月底是多少天*/
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(c.get(Calendar.YEAR), 2,1);
		//c.set(Calendar.DAY_OF_MONTH,0);
		c.add(Calendar.DAY_OF_MONTH,-1);
		int day=c.get(Calendar.DAY_OF_MONTH);
		/*System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));*/
	
		if(day==29){
			System.out.println(c.get(Calendar.YEAR)+"年是闰年");
		}
		if(day==28){
			System.out.println(c.get(Calendar.YEAR)+"年是平年");
		}
	}
}
