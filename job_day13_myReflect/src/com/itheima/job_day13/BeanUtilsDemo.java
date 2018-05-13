package com.itheima.job_day13;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilsDemo {
	/*beanutils
	 * static void setProperty(Object bean,String name,object value)
	 * static String getProperty(Object bean,String name)
	 * static void populate(Object bean,Map proterties)---Map<String,Object>
	 * ע:BeanUtils��setProperty��getProperty�����ײ㲢����ֱ�Ӳ�����Ա���������ǲ����ͳ�Ա�������йص�get��set����
	 * 		populate�����ײ��ǵ���setProperty����,����Ҫ��javaBeanû��set/get����,�޷���ӳɹ�
	 * */
	public static void main(String[] args) throws ReflectiveOperationException, InvocationTargetException {
		//ʹ��BeanUtils��setProperty��getProperty����
		Object p1=new Person();
		//System.out.println(p1.getClass());�õ�����Person����Object
		BeanUtils.setProperty(p1, "name", "����");
		BeanUtils.setProperty(p1, "age", 60);
		System.out.println(BeanUtils.getProperty(p1,"name"));
		System.out.println(BeanUtils.getProperty(p1,"name"));
		System.out.println(p1);
		//ʹ��BeanUtils��populat����
		Person p=new Person();
		HashMap<String,Object> hm=new HashMap<>();
		hm.put("name", "��С��");
		hm.put("age", 30);
		hm.put("gender", "��");//Person��û��gendar����,����Ҳ���ᱨ��,�����Զ�����
		BeanUtils.populate(p, hm);
		System.out.println(p);
	}
}
