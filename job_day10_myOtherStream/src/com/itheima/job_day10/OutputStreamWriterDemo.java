package com.itheima.job_day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileManager.Location;

public class OutputStreamWriterDemo {
	/*需求:读取项目根目录下的一个SystemInOutDemo.java文件,并输出到命令行*/
	public static void main(String[] args) throws IOException {
		//method();
		/*
		 * 由于标准输出流是一个字节输出流，所以只能输出字节或者字节数组，但是我们读取到的数据则是字符串，如果想进行输出还需要转换成字节数组
		 * 我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可，OutputStreamWriter
		 */
		BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		
		
	}

	public static void method() throws FileNotFoundException, IOException {
		//从文件中读取数据---可以用字节流也可以用字符流,我选高效流
		//因为要打印到命令行--故选标准输出流
		BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
		OutputStream out=System.out;
		String line;
		while((line=br.readLine())!=null){
			//输出到命令行
			out.write(line.getBytes());//注标准输出流只能写字节和字节数组.而这里我读取到的是字符串,咋整?把字符串转成字节数组
			out.write("\r\n".getBytes());//这里要手动写入换行,且也要转字节数组
		}
	}
}
