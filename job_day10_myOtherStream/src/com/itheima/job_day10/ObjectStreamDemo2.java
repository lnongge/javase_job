package com.itheima.job_day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamDemo2 {
	/**/
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		//写入对象
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("o.txt"));
		ArrayList<Student> list=new ArrayList<>();
		Student s1=new Student("胡一刀",35);
		Student s2=new Student("苗人凤",36);
		list.add(s1);
		list.add(s2);
		oos.writeObject(list);
		oos.close();
		//读取对象
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("o.txt"));
		
		Object obj = ois.readObject();
		ArrayList<Student> resultList=(ArrayList<Student>) obj;
		for (Student student : resultList) {
			System.out.println(student);
		}
	}
}
