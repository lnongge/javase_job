package com.itheima.job_day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapAndMapDemo {
	/*MapǶ��Map*/
	public static void main(String[] args) {
		HashMap<String,Map<String,String>> itheima=new HashMap<>();
		HashMap<String,String> base=new HashMap<>();
		base.put("itcast001", "���޼�");
		base.put("itcast002", "����");
		base.put("itcast003", "������");
		HashMap<String,String> job=new HashMap<>();
		job.put("itcast001", "�����");
		job.put("itcast002", "��ӯӯ");
		job.put("itcast003", "����ɺ");
		
		itheima.put("������", base);
		itheima.put("��ҵ��", job);
		
		//����
		Set<String> set=itheima.keySet();
		for (String key : set) {
			System.out.println(key+"ѧ��:");
			Map<String,String> valueMap=itheima.get(key);
			Set<Entry<String, String>> entrySet = valueMap.entrySet();
			for (Entry<String, String> entry : entrySet) {
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			}
		}
		
	}
}
