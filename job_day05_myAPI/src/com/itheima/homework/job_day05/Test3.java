package com.itheima.homework.job_day05;

public class Test3 {
	/*
	 * 第三题：分析以下需求，并用代码实现
  	(根据描述写匹配手机号和邮箱的正则表达式)
	1.根据描述写出正则表达式
		(1)手机号正则:
			第一位为1
			第二位为3或4或5或7或8
			第三~十一位为0~9的其中一个数字
		(2)邮箱正则:以@分界
			@ 符号左边为任意多个字母或数字
			@ 符号右边为任意多个字母或数字+点符号+任意多个字母或数字

	2.利用正则表达式完成以下需求:
		(1)判断手机号"11600014387"是否符合手机的格式
		(2)定义一个存放邮箱的字符串数组{"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"}
		利用正则表达式过滤出所有的邮箱,打印正确的邮箱
	 * */
	public static void main(String[] args) {
		//检验手机号11600014387
		String phoneNum="11600014387";
		if(phoneNum.matches("1[34578]\\d{9}")){
			System.out.println("手机号"+phoneNum+"符合手机格式");
		}else{
			System.out.println("手机号"+phoneNum+"不符合手机格式");
		}
		//检验邮箱
		String[] strs={"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"};
		for(int i=0;i<strs.length;i++){
			String s=strs[i];
			if(s.matches("\\w+@\\w+(\\.\\w+)+")){
				System.out.println(strs[i]);
			}
		}
		
	}
}
