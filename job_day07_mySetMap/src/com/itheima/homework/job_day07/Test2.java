package com.itheima.homework.job_day07;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
	/*�ڶ��⣺�����������󣬲��ô���ʵ��	
	���̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
	�����¼�룺"wahahahahahahakuangquanshui"
	����̨��ӡ��
			w
			g
			u
			s
			q
			a
			n
			k
			h
			i*/
	public static void main(String[] args) {
		/*��set����*/
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:");
		String s = sc.nextLine();
		//��������ַ�����ÿ���ַ��洢��Set,����set���ص�ȥ��
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		//����Set
		 for (char ch : hs) {
			System.out.println(ch);
		}
	}
}
