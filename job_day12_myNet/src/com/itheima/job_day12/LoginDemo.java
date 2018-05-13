package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class LoginDemo {
	/*模拟用户登录*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建发送socket对象
		Socket s=new Socket(InetAddress.getByName("lianws"),10086);
		//创建输出流
		OutputStream os = s.getOutputStream();//这里写我用的是字节流,可以使用打印流PrintWriter传入s.getOutputStream()即可
		//创建数据
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名:");
		String str=sc.nextLine();
		System.out.println("请输入密码:");
		String psd=sc.nextLine();
		//发送给客服端
		os.write(str.getBytes());
		os.write(psd.getBytes());
		//接收服务器的反馈信息
		InputStream is=s.getInputStream();//这里读我也用我用的是字节流,可以使用高效流.用转换流转
		int len;
		byte[] bys=new byte[1024];
		len=is.read(bys);
		System.out.println(new String(bys,0,len));
		/*while((len=is.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}*/
		is.close();
		os.close();
		s.close();
	}
}
