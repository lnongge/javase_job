package com.itheima.job_day09;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File f=new File("c");
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.delete());
	}
}
