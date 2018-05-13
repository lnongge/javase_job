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
��һ�⣺�����������󣬲��ô���ʵ��
	1.����ѧ����,��������(String name),�Ա�(String gender),����(int age)��������,���ɿղ��вι���,set��get����,toString����
	2.����¼��6��ѧԱ��Ϣ(¼���ʽ:����,��,25),Ҫ����������ͬ����Ϣ,��6��ѧԱ��Ϣ���뵽ArrayList������
	3.������6��ѧԱ��Ϣ��ArrayList���϶���д�뵽D:\\StudentInfo.txt�ļ���
	4.��ȡD:\\StudentInfo.txt�ļ��е�ArrayList���󲢱�����ӡ
	5.��ArrayList�����е�6��ѧ���������ȥ��,��ȥ�غ�Ľ������PrintWriter��д�뵽E:\\StudentInfo.txt�ļ���(д���ʽ������-��-25)
		 * */
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> list=new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			System.out.println("�������"+(i+1)+"λѧ������:");
			String name=sc.nextLine();
			System.out.println("�������"+(i+1)+"λѧ���Ա�:");
			String gender=sc.nextLine();
			System.out.println("�������"+(i+1)+"λѧ������:");
			int age=sc.nextInt();
			sc.nextLine();
			list.add(new Student(name,gender,age));
		}
		//д�����ı��ļ�
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("StudentInfo.txt"));
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		//���ı���Arraylist
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("StudentInfo.txt"));
		Object obj=ois.readObject();
		ArrayList<Student> list2=(ArrayList<Student>) obj;
		ArrayList<Student> list3=new ArrayList<>();//ȥ�غ��Ԫ��
		for (Student student : list2) {
			if(!list3.contains(student)){
				list3.add(student);
			}
		}
		
		//��ȥ�ؽ��д��
		PrintWriter pw=new PrintWriter("d:\\StudentInfo.txt");
		for (Student stu : list3) {
			pw.println(stu.getName()+"-"+stu.getGender()+"-"+stu.getAge());
			//���������ƴ�ӿ���д��toString��,Ȼ��pw.println(stu.toString());
		}
		pw.close();
	}
}
