package com.itheima.job_day12;

import java.net.InetAddress;
import java.net.UnknownHostException;
	/*��ʾip����InetAddress��*/
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ina=InetAddress.getByName("DESKTOP-VENGI90");
		String ip=ina.getHostAddress();
		String name=ina.getHostName();
		System.out.println(ip);
		System.out.println(name);
	}
}
