package com.itheima.homework.job_day13;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	/*����һ��JavaBean��ClassRoom
		  ������: ��ţ�        int classNo  
				  �༶���ƣ� String className
				  �༶����      int stuCount
				  ѧ������   String[] stuName
		  ����toString()����.
	   ����ClassRoom����ʹ��beanUtils������Ϊ������ֵ��
	   ��ӡ������£�	
	   ClassRoom [classNo=1, className=һ�꼶, stuCount=3, stuName=[����, ����, ����]]*/
	public static void main(String[] args) {
		ClassRoom cr=new ClassRoom();
		Map<String,Object> map=new HashMap<>();
		map.put("classNo", 1);
		map.put("className", "һ�꼶");
		map.put("stuCount", 3);
		map.put("stuName", "[����, ����, ����]");
	}
}
