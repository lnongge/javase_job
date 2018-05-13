package com.itheima.homework.job_day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	/*
	* ------------------------------------------------------------------
第一题：分析以下需求，并用代码实现
	1.定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
	2.键盘录入6个学员信息(录入格式:张三,男,25),要求有两个相同的信息,将6个学员信息存入到ArrayList集合中
	3.将存有6个学员信息的ArrayList集合对象写入到D:\\StudentInfo.txt文件中
	4.读取D:\\StudentInfo.txt文件中的ArrayList对象并遍历打印
	5.对ArrayList集合中的6个学生对象进行去重,将去重后的结果利用PrintWriter流写入到E:\\StudentInfo.txt文件中(写入格式：张三-男-25)
		 * */
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> list=new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			System.out.println("请输入第"+(i+1)+"位学生姓名:");
			String name=sc.nextLine();
			System.out.println("请输入第"+(i+1)+"位学生性别:");
			String gender=sc.nextLine();
			System.out.println("请输入第"+(i+1)+"位学生年龄:");
			int age=sc.nextInt();
			sc.nextLine();
			list.add(new Student(name,gender,age));
		}
		//写对象到文本文件
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("StudentInfo.txt"));
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		//从文本到Arraylist
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("StudentInfo.txt"));
		Object obj=ois.readObject();
		ArrayList<Student> list2=(ArrayList<Student>) obj;
		ArrayList<Student> list3=new ArrayList<>();//去重后的元素
		for (Student student : list2) {
			if(!list3.contains(student)){
				list3.add(student);
			}
		}
		
		//将去重结果写入
		PrintWriter pw=new PrintWriter("d:\\StudentInfo.txt");
		for (Student stu : list3) {
			pw.println(stu.getName()+"-"+stu.getGender()+"-"+stu.getAge());
			//或这里可以拼接可以写在toString里,然后pw.println(stu.toString());
		}
		pw.close();
	}
}
