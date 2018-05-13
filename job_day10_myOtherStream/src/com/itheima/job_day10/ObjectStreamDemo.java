package com.itheima.job_day10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	/*������������*/
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//д�����
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("o.txt"));
		Student s1=new Student("����",18);
		Student s2=new Student("����",16);
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		oos.close();
		//�������
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("o.txt"));
		try {
			while(true){
				Object o=ois.readObject();
				System.out.println(o);
			}
		} catch (EOFException e) {
			System.out.println("������");
		}
		//�ͷ���Դ
		ois.close();
	}
}
