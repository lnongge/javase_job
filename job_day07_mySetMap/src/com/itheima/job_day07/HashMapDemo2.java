package com.itheima.job_day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		//Map���ϵĵ�һ�ֱ�����ʽ
		HashMap<String,String> hm=new HashMap<>();
		hm.put("л����", "�Ű�֥");
		hm.put("�̹�ϣ", "����ͩ");
		hm.put("������", "����");
		//������һ�ַ���:keySet+forѭ��
		System.out.println("----�����ĵ�һ�ַ�ʽ---");
		Set<String> keys=hm.keySet();
		for (String key : keys) {
			String value=hm.get(key);
			System.out.println("�ɷ�:"+key+",����:"+value);
		}
		
		//�����ڶ��ַ�ʽ:entrySet()+forѭ��
		System.out.println("----�����ĵڶ��ַ�ʽ---");
		Set<Map.Entry<String,String>> entrySet=hm.entrySet();//Map.Entry<String,String>��һ����,������Entry,��Map����ڲ���,�������з���
		for (Entry<String, String> entry : entrySet) {
			String name=entry.getKey();
			String wife=entry.getValue();
			System.out.println("�ɷ�:"+name+",����:"+wife);
		}
		//���������ַ�ʽ:entrySet()+iterator������
		System.out.println("----�����ĵ����ַ�ʽ-----");
		//������entrySet()ֱ���õڶ��ַ�ʽ�д�����entrySet
		Iterator<Map.Entry<String,String>> it=entrySet.iterator();
		while(it.hasNext()){
			Entry<String,String> entry=it.next();
			String name=entry.getKey();
			String wife=entry.getValue();
			System.out.println("�ɷ�:"+name+",����:"+wife);
		}
		
	}
}
