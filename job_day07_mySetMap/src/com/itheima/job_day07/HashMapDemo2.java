package com.itheima.job_day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		//Map集合的第一种遍历方式
		HashMap<String,String> hm=new HashMap<>();
		hm.put("谢霆锋", "张柏芝");
		hm.put("程冠希", "钟欣桐");
		hm.put("李亚鹏", "王菲");
		//遍历第一种方法:keySet+for循环
		System.out.println("----遍历的第一种方式---");
		Set<String> keys=hm.keySet();
		for (String key : keys) {
			String value=hm.get(key);
			System.out.println("丈夫:"+key+",妻子:"+value);
		}
		
		//遍历第二种方式:entrySet()+for循环
		System.out.println("----遍历的第二种方式---");
		Set<Map.Entry<String,String>> entrySet=hm.entrySet();//Map.Entry<String,String>是一个类,类名叫Entry,是Map类的内部类,这个类带有泛型
		for (Entry<String, String> entry : entrySet) {
			String name=entry.getKey();
			String wife=entry.getValue();
			System.out.println("丈夫:"+name+",妻子:"+wife);
		}
		//遍历第三种方式:entrySet()+iterator迭代器
		System.out.println("----遍历的第三种方式-----");
		//我这里entrySet()直接用第二种方式中创建的entrySet
		Iterator<Map.Entry<String,String>> it=entrySet.iterator();
		while(it.hasNext()){
			Entry<String,String> entry=it.next();
			String name=entry.getKey();
			String wife=entry.getValue();
			System.out.println("丈夫:"+name+",妻子:"+wife);
		}
		
	}
}
