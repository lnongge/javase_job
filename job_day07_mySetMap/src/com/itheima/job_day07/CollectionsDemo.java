package com.itheima.job_day07;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	/*ģ�⶷��������
	 * ����
	 * ϴ��
	 * ����
	 * */
	public static void main(String[] args) {
	//1.����
		//��ɫ
		String[] color ={"����","����","����","÷��"};
		//��ɫ
		String[] nums={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//�ƺ�
		ArrayList<String> list=new ArrayList<>();
		for (int i = 0; i < color.length; i++) {
			String s=color[i];
			for (int j = 0; j < nums.length; j++) {
				list.add(s+nums[j]);
			}
		}
		list.add("����");//��Ҫ���ǻ��д�С��
		list.add("С��");
		System.out.println("ϴ��ǰ:"+list);
	//2.ϴ��
		Collections.shuffle(list);
		System.out.println("ϴ�ƺ�:"+list);
		
	//3.����
		//��3������
		ArrayList<String> ��־��=new ArrayList<>();
		ArrayList<String> �����=new ArrayList<>();
		ArrayList<String> ������=new ArrayList<>();
		for (int i = 0; i < list.size()-3; i++) {//������Ҫ��3�ŵ���
			String card=list.get(i);
			//3λ�������γ���
			if(i%3==0)
				��־��.add(card);
			if(i%3==1)
				�����.add(card);
			if(i%3==2)
				������.add(card);
		}
		
		//�������,��ӡ��3�����ѵ��ƺ͵���
		System.out.println("��־�������ֵ:"+��־��);
		System.out.println("����Ƶ�����ֵ:"+�����);
		System.out.println("�����͵�����ֵ:"+������);
		System.out.println("�������:");
		for (int i = list.size()-3; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
