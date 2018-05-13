package com.itheima.homework.job_day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test4 {
	/*��������ʦ�����ԭ��ҵ�в�û��(Ҫ����)
	 * 1��֪�����ַ���;"2015-10-20",���������ַ���ת��Ϊ���ڶ���
	 * 2.����1�е����ڶ���ת��Ϊ���������
	 * 3.��������(����)�����ȡ�����������ڼ�,�Ѿ���һ���еĵڼ���
	 * 4.ͨ������¼�������ַ���,��ʽ(2015-10-20)
	 * 	������:2015-10-20,���"2015��-10��-20�������ڶ�,��2015��ĵ�293��"
	 * */
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String dateStr=null;
		while(true){
			System.out.println("����������(��ʽΪ:xxxx-xx-xx)");
			dateStr=sc.nextLine();
			String regex="[1-9]\\d{3}+-(([0][1-9])|(1[0-2]))-((0[1-9])|([1-2][0-9])|(3[0-1]))";
			if(dateStr.matches(regex)){
				break;
			}else{
				System.out.println("����������ڸ�ʽ����,����������!");
			}
		}
		
		//1.�����ַ���-->���ڶ���:����
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateStr);
		//2���������ת���������--
		Calendar cldr=sdf.getCalendar();
		//3.��һ������:ʹ��������Calendar
		//��Ϊ������û���ֶ����������ڼ�,�����������Լ���һ��---������(Ҳ������switch��)
		
		/*String[] week={"������","����һ","���ڶ�","������","������","������","������"};
		int weekIndex=cldr.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(cldr.get(Calendar.YEAR)+"��-"+(cldr.get(Calendar.MONTH)+1)+"��-"+cldr.get(Calendar.DAY_OF_MONTH)+"����"+
		week[weekIndex]+",��"+cldr.get(Calendar.YEAR)+"��ĵ�"+cldr.get(Calendar.DAY_OF_YEAR)+"��");*/
		
		//3.�ڶ�������:ʹ��������Date
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��-MM��-dd����E,��yyyy��ĵ�DD��");
		String result=sdf2.format(date);
		System.out.println(result);
		
		
		
	}
}
