package com.itheima.job_day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class LoginServer {
	/*用户登录的服务器端*/
	public static void main(String[] args) throws IOException {
		System.out.println("服务器启动..");
		//创建服务器socket
		ServerSocket ss=new ServerSocket(10086);
		//监听
		Socket s=ss.accept();
		//创建接受流
		InputStream is=s.getInputStream();//这里读我也用我用的是字节流,可以使用高效流.用转换流转
		//接收数据
		byte[] by=new byte[1024];
		int len=is.read(by);
		String name=new String(by,0,len);
		System.out.println(name);
		int len2=is.read(by);
		String psd=new String(by,0,len2);
		User u=new User(name,psd);
		System.out.println(psd);
		//判断结果并返回给客服端
		OutputStream os=s.getOutputStream();////这里写我用的是字节流,可以使用打印流PrintWriter传入s.getOutputStream()即可
		if(UserDB.getList().contains(u)){
			os.write("登录成功".getBytes());
		}else{
			os.write("登录失败".getBytes());
		}
		
		//释放资源
		os.close();
		is.close();
		s.close();
		//ss.close();
	}
}
