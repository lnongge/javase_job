package com.itheima.job_day05;

import java.util.Date;

public class DateDemo {
	/*Date的常用方法*/
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toLocaleString());
		d.setTime(1000L*60*60*24*365*10);
		System.out.println(d.toLocaleString());
		
	}
}
