package com.itheima.homework.job_day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test3 {
	/*aa.txt文件（UTF-8编码）中有字符串“键盘敲烂，月薪过万”
	读取aa.txt文件中的内容并打印到控制台上
	将读取到的内容以GBK编码的格式写入到cc.txt文件中--这步肯定会乱码(因为原始文件数据就是utf-8,你怎么也无法把它转成GBK不乱码)
	*/
	public static void main(String[] args) throws IOException, FileNotFoundException {
		//读取aa.txt中内容并打印到控制台
		FileInputStream fis=new FileInputStream("aa.txt");
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("cc.txt"));
		int len;
		byte[] bys=new byte[1024];
		while((len=fis.read(bys))!=-1){
			//读取的内容写到控制台
			System.out.println(new String(bys,0,len,"utf-8"));
			//读取的内容写以GBK格式写到cc.txt--因为字节流没法指定编码格式所有用转换流
			/*现在我读到的是utf-8的内容,要以GBK格式写入到cc.txt,把读到的转成GBK再写到cc.txt才不会乱码*/
			String s=new String(bys,0,len);
			System.out.println(s);//乱码了
			//osw.write(new String(bys,0,len));
			//osw.flush();
		}
		//释放资源
		osw.close();
		fis.close();
		
		
		//method0();
		//字符转换流读并指定编码
		//method();
	}

	public static void method0() throws FileNotFoundException, UnsupportedEncodingException, IOException {
		//字节流写入
		FileOutputStream fos =new FileOutputStream("aa.txt");
		String s1="赢取白富美";
		byte[] bys=s1.getBytes("utf-8");
		fos.write(bys);
		fos.close();
		//读取
	}

	public static void method() throws FileNotFoundException, IOException, UnsupportedEncodingException {
		InputStreamReader isr=new InputStreamReader(new FileInputStream("aa.txt"));
		
		int len;
		char[] chs=new char[1024];
		//byte[] bys=new byte[1024];
		while((len=isr.read(chs))!=-1){
			String s2=new String(chs,0,len);//string是gbk
			System.out.println(s2);
			//打成字符数组
			byte[] by=s2.getBytes("UTF-8");
			System.out.println(new String(by));
			
		}
		isr.close();
	}
}
