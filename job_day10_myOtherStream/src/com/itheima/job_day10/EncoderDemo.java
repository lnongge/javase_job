package com.itheima.job_day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncoderDemo {
	/*java中字符串的默认编码
	 * 1.使用字节输出流,向e.txt写一个字符串.然后把e.txt改成utf-8编码,再写一遍--e.txt中乱码了
	 * 
	 * 2.读
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		//method();
		/*读*/
		FileInputStream fis=new FileInputStream("e.txt");
		byte[] bys=new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1){
			//System.out.println(new String(bys,0,len));
			//乱码了,因为现在e.txt是utf-8,而我直接输出字符串,字符串默认是gbk,不一致故乱码
			//怎么解决?在构造字符串的时候做手脚--api中看String构造String(byte[],int start,int len, String charsetName)
			
			System.out.println(new String(bys,0,len,"utf-8"));
		}
		
	}

	public static void method() throws FileNotFoundException, UnsupportedEncodingException, IOException {
		/*写*/
		String s="日出东方,唯我不败";
		//这里我用字节输出流
		FileOutputStream fos=new FileOutputStream("e.txt");
		//因为字节输出流只能写字节数组和字节,不能直接写字符串,所有我需要把字符串打回原型
		//byte[] bys=s.getBytes();//字符串转成字节数组,默认使用GBK编码
		byte[] bys=s.getBytes("utf-8");
		
		fos.write(bys);
		fos.close();
	}
}
