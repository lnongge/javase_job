package com.itheima.job_day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo {
	/*���ڵĸ�ʽ�������*/
	public static void main(String[] args) throws ParseException {
		//��ʽ��:Date ----String:��SimpleDateFormat��String format(Date)����
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��M��d��  HHʱm��s�� E");
		String sDate=sdf.format(d);
		System.out.println(sDate);
		//����:String ---Date ��SimpleDateFormat��Date parse(String)����-�÷������׳��쳣
		Date destD=sdf.parse(sDate);
		System.out.println(destD);
		
	}
}
