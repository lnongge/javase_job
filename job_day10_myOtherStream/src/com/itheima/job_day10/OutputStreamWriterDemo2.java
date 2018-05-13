package com.itheima.job_day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo2 {
	/*(自己的想法:)
	 * 实现:从项目根目录下用字符流读取图片,输出到控制台
	 * 分析:字符流无法直接读取图片,视频等二进制文件,所有我需要用到转换流
	 * 结果:失败--原因:字符转换流始终是字符流无法输出图片,(会丢失信息)
	 * */
	public static void main(String[] args) throws IOException {
		//读:使用高效流
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("liuyan.jpg")));
		//写:使用高效流
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("G:\\temp\\l.jpg")));
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.flush();
		}
		//释放资源
		br.close();
		bw.close();
	}
}
