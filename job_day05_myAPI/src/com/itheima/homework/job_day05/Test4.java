package com.itheima.homework.job_day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test4 {
	/*本题是老师补充的原作业中并没有(要掌握)
	 * 1已知日期字符串;"2015-10-20",将该日期字符串转换为日期对象
	 * 2.根据1中的日期对象转换为日历类对象
	 * 3.根据日期(日历)对象获取该日期是星期几,已经这一年中的第几天
	 * 4.通过键盘录入日期字符串,格式(2015-10-20)
	 * 	如输入:2015-10-20,输出"2015年-10月-20日是星期二,是2015年的第293天"
	 * */
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String dateStr=null;
		while(true){
			System.out.println("请输入日期(格式为:xxxx-xx-xx)");
			dateStr=sc.nextLine();
			String regex="[1-9]\\d{3}+-(([0][1-9])|(1[0-2]))-((0[1-9])|([1-2][0-9])|(3[0-1]))";
			if(dateStr.matches(regex)){
				break;
			}else{
				System.out.println("你输入的日期格式不对,请重新输入!");
			}
		}
		
		//1.日期字符串-->日期对象:解析
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateStr);
		//2日期类对象转日历类对象--
		Calendar cldr=sdf.getCalendar();
		//3.第一种做法:使用日历类Calendar
		//因为日历类没有字段是中文星期几,所以我这里自己造一个---用数组(也可以用switch做)
		
		/*String[] week={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		int weekIndex=cldr.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(cldr.get(Calendar.YEAR)+"年-"+(cldr.get(Calendar.MONTH)+1)+"月-"+cldr.get(Calendar.DAY_OF_MONTH)+"日是"+
		week[weekIndex]+",是"+cldr.get(Calendar.YEAR)+"年的第"+cldr.get(Calendar.DAY_OF_YEAR)+"天");*/
		
		//3.第二种做法:使用日期类Date
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年-MM月-dd日是E,是yyyy年的第DD天");
		String result=sdf2.format(date);
		System.out.println(result);
		
		
		
	}
}
