package com.itheima.homework.job_day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {
	/*------------------------------------------------------------------
第一题：分析以下需求，并用代码实现
	项目根路径下有个questions.txt文件内容如下：
	5+5
	150-25
	155*155
	2555/5
	要求：读取内容计算出结果，将结果写入到results.txt文件中
	内容为：
	5+5=10
	150-25=125
	155*155=24025
	2555/5=511*/
	public static void main(String[] args) throws IOException {
		//使用高效字符流读取问题,使用打印流写结果到results.txt
		BufferedReader br =new BufferedReader(new FileReader("questions.txt"));
		PrintWriter pw=new PrintWriter(new FileWriter("results.txt"),true);
		String line;
		while((line=br.readLine())!=null){
			if(line.matches("[0-9]+\\+[0-9]+")){//加法运算
				String[] strs=line.split("\\+");
				int result=Integer.parseInt(strs[0])+Integer.parseInt(strs[1]);
				//pw.println(strs[0]+"+"+strs[1]+"="+result);
				pw.println(line+"="+result);
			}
			if(line.matches("[0-9]+-[0-9]+")){//减法运算
				String[] strs=line.split("-");
				int result=Integer.parseInt(strs[0])-Integer.parseInt(strs[1]);
				pw.println(strs[0]+"-"+strs[1]+"="+result);
			}
			if(line.matches("[0-9]+\\*[0-9]+")){//乘法运算
				String[] strs=line.split("\\*");
				int result=Integer.parseInt(strs[0])*Integer.parseInt(strs[1]);
				pw.println(strs[0]+"*"+strs[1]+"="+result);
			}
			if(line.matches("[0-9]+/[0-9]+")){//除法运算
				String[] strs=line.split("/");
				int result=Integer.parseInt(strs[0])/Integer.parseInt(strs[1]);
				pw.println(strs[0]+"/"+strs[1]+"="+result);
			}
		}
		//释放资源
		br.close();
		pw.close();
		
	}
}
