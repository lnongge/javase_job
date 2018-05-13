package com.itheima.job_day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	/**/
	public static void main(String[] args) throws ParseException {
		String birthday="1991-12-14";
		String currday="2018-4-27";
		//把2个日期解析成Date
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		Date birDate=sdf.parse(birthday);
		Date currDate=sdf.parse(currday);
		
		long star=birDate.getTime();
		long curr=currDate.getTime();
		long dNum=(curr-star)/1000/60/60/24;
		System.out.println("你至今已经活了"+dNum+"天,按一年365天算已经活了:"+(dNum/365)+"年"+(dNum%365)+"天");
	}
}
