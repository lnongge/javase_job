package com.itheima.job_day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapAndMapDemo {
	/*MapÇ¶Ì×Map*/
	public static void main(String[] args) {
		HashMap<String,Map<String,String>> itheima=new HashMap<>();
		HashMap<String,String> base=new HashMap<>();
		base.put("itcast001", "ÕÅÎŞ¼É");
		base.put("itcast002", "ÕÔÃô");
		base.put("itcast003", "ÖÜÜÆÈô");
		HashMap<String,String> job=new HashMap<>();
		job.put("itcast001", "Áîºü³å");
		job.put("itcast002", "ÈÎÓ¯Ó¯");
		job.put("itcast003", "ÔÀÁéÉº");
		
		itheima.put("»ù´¡°à", base);
		itheima.put("¾ÍÒµ°à", job);
		
		//±éÀú
		Set<String> set=itheima.keySet();
		for (String key : set) {
			System.out.println(key+"Ñ§Éú:");
			Map<String,String> valueMap=itheima.get(key);
			Set<Entry<String, String>> entrySet = valueMap.entrySet();
			for (Entry<String, String> entry : entrySet) {
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			}
		}
		
	}
}
