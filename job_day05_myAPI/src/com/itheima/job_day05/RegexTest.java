package com.itheima.job_day05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	/*本题是xmin图的扩展题
	 * 1.String s="我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
	 * 	编写正则输出:我要学编程
	 * 2.String s = "我的手机是18511866260,我曾用过18987654321,还用过18812345678";
	 * 	利用正则输出所有手机号
	 * */
	public static void main(String[] args) {
		String s1="我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String rs=s1.replaceAll("[我要学编程.][我要学编程.]+", "我要学编程");
		System.out.println(rs);
		
		/*String str = "Hello12345World6789012";
		str = str.replaceAll("[\\d]+", "#");
		System.out.println(str);*/
		
		//第二题
		String s2 = "我的手机是18511866260,我曾用过18987654321,还用过18812345678";
		String regex="1[34578]\\d{9}";
		Matcher m=Pattern.compile(regex).matcher(s2);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
