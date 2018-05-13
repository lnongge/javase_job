package com.itheima.job_day10;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EncoderDemo2 {
	/*
	 * 字符流中的编码
	 * */
	public static void main(String[] args) throws IOException {
		//method();
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("e2.txt"),"utf-8");
		String s="赢取白富美";
		osw.write(s);
		osw.close();
		
	}

	public static void method() throws IOException, UnsupportedEncodingException {
		FileWriter fw=new FileWriter("e2.txt");
		String str="月薪过万";
		
		/*System.out.println("gbk的字符串");
		byte[] bs=str.getBytes();
		for (byte b : bs) {
			System.out.println(b);
		}*/
		
		byte[] bys=str.getBytes("utf-8");
		/*System.out.println("utf-8的字符串");
		for (byte b : bys) {
			System.out.println(b);
		}*/
		//fw.write(str);
		fw.write(new String(bys));
		fw.close();
		/*这里我要琢磨下:字符流为什么会出现?文件底层全是字节,所有我们有了字节流之后,可以取读写任何文件,
		 * 可以取复制任何文件,但是一些文本文件它里面有一些文字,我们使用字节流来读写,就不是很方便.所以出现了
		 * 字符流.它直接把我们想要的字符转了出来,把多个字节转成了字符,那我们就可以看到我们想要的字符了.
		 * 那字符输出流在写一个字符串的时候,它真的是直接把字符串写到文件中吗?文件中的这些数据啊都是二进制,都是0和1
		 * 所有这个方法写出的是字符串,但是底层的方法并不是这样,我们点开...0722
		 * 我们写一个字符串,其实写的是一个字符数组,字符数组还是要把它转成0和1,再写出
		 * */
	}
}
