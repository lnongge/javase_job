package com.itheima.job_day07;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		//映射(添加)功能
		hm.put("柳岩", "30");
		hm.put("景甜", "20");
		hm.put("林青霞", "34");
		hm.put("柳岩", "34");
		System.out.println(hm);
		//获取功能
		System.out.println(hm.get("景甜"));
		//删除功能
		//hm.clear();
		//.out.println(hm.size());
		hm.remove("林青霞");
		System.out.println(hm);
	}
}
