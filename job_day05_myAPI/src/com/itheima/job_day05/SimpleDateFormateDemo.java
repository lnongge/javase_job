package com.itheima.job_day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo {
	/*日期的格式化与解析*/
	public static void main(String[] args) throws ParseException {
		//格式化:Date ----String:用SimpleDateFormat的String format(Date)方法
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年M月d日  HH时m分s秒 E");
		String sDate=sdf.format(d);
		System.out.println(sDate);
		//解析:String ---Date 用SimpleDateFormat的Date parse(String)方法-该方法会抛出异常
		Date destD=sdf.parse(sDate);
		System.out.println(destD);
		
	}
}
