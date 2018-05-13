package com.itheima.job_day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class InputStreamReaderDemo {
	/*(可反复看)
	 * 从键盘读取一个数据,写入到根目录下的a.txt文件
	 * 用输入转换流:OutputStreamWriter 
	 * */
	public static void main(String[] args) throws IOException {
		//method();

		//method2();
		//扩展:从键盘读取一个数据,写到控制台
		System.out.println("请输入数据:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));//---用这个是题目要求
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//(3)--我自己的扩展:键盘输入数据,在控制台上打印出来结果
		String line;
		while((line=br.readLine())!=null){
			System.out.print("你输入的是:");//(3)
			bw.write(line);//这3句是写数据到控制台,我TMD可以之间用System.out输出
			//bw.newLine();
			bw.flush();
			System.out.println("你输入的是:"+line);
			System.out.println("请输入数据:");
		}
		bw.close();
		br.close();
		
		//上面这段代码,我TMD就可以用下面这段代码实现
		/*Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("请输入数据:");
			String line=sc.nextLine();
			System.out.println("你输入的是:"+line);
		}*/
	}

	public static void method2() throws IOException {
		//用转换流来做----进阶做法
		System.out.println("请输入数据:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));//---用这个是题目要求
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	public static void method() throws IOException {
		//不用转换流实现---原始做法
		System.out.println("请输入数据:");
		InputStream in=System.in;
		
		FileWriter fw=new FileWriter("a.txt");
		
		int len;
		byte[] bys=new byte[1024];
		while((len=in.read(bys))!=-1){
			fw.write(new String(bys,0,len));
			fw.flush();
		}
		in.close();
		fw.close();
	}
}
