package com.itheima.homework.job_day06;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	/*�����⣺�����������󣬲��ô���ʵ��
	1.�����´��룺
		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("a");
			list.add("a");
			list.add("c");
			list.add("c");
			list.add("a");
			list.add("d");
			
			noRepeat(list);
			System.out.println(list);
		}
	2.����һ��noRepeat()����,Ҫ��Դ��ݹ��������н���Ԫ��ȥ��
		public static void noRepeat(List<String> list){

		}
---------------------------------------------------------------*/
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("a");
		list.add("d");
		
		noRepeat(list);
		System.out.println(list);
	}

	private static void noRepeat(List<String> list) {
		for(int i=0;i<list.size();i++){//ȡ�������е�ÿ��Ԫ��
			String s=list.get(i);
			for(int j=0;j<i;j++){//�õ������е�Ԫ��,����������ǰ���Ԫ�رȽ��������ȵľ������ظ���,��ǰ��Ԫ��ɾ��
				if(list.get(j)==s){
					list.remove(i--);
				}
			}
		}
	}
}
