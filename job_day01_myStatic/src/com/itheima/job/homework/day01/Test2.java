package com.itheima.job.homework.day01;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	/*
	 * �ڶ���:������������,���ô���ʵ�� ������С��Ϸ: 
	 * 1.ϵͳ����һ�������1~100֮��ġ� 2.����¼������Ҫ�µ�����
	 * 3.�Ƚ�����������(��if���) 
	 * 	���ˣ�������ʾ���� 
	 * 	С�ˣ�������ʾС�� 
	 * 	�����ˣ�������ʾ����ϲ�㣬������ 
	 * 4.һֱ��,ֱ���¶�Ϊֹ
	 */
	public static void main(String[] args) {
		Random r=new Random();
		int num=r.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("������µ���:");
			int guessNum=sc.nextInt();
			if(guessNum==num){
				System.out.println("��ϲ��,������");
				break;
			}else if(guessNum>num){
				System.out.println("����");
			}else{
				System.out.println("С��");
			}
		}
		
	}
}
