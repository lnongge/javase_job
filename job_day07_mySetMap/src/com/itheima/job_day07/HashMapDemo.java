package com.itheima.job_day07;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		//ӳ��(���)����
		hm.put("����", "30");
		hm.put("����", "20");
		hm.put("����ϼ", "34");
		hm.put("����", "34");
		System.out.println(hm);
		//��ȡ����
		System.out.println(hm.get("����"));
		//ɾ������
		//hm.clear();
		//.out.println(hm.size());
		hm.remove("����ϼ");
		System.out.println(hm);
	}
}
