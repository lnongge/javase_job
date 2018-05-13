package com.itheima.job_day13;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyBeanUtils {
	/*�Լ�д�Ĺ�����ʵ��BeanUtils�Ĺ���
	 * ������:1.����˽��2.���г�Աstatic����
	 * */
	private MyBeanUtils(){};
	public static void setProperty(Object bean,String name,Object value) throws ReflectiveOperationException, SecurityException{
		//��ȡ�ֽ������
		Class c=bean.getClass();
		//��ȡ�ֶ�
		Field f=c.getDeclaredField("name");
		f.setAccessible(true);
		//����ֵ
		f.set(bean, value);
	}
	public static String getProperty(Object bean,String name) throws ReflectiveOperationException, Exception{
		//��ȡ�ֽ������
		Class c=bean.getClass();
		//��ȡ�ֶ�
		Field f=c.getDeclaredField("name");
		f.setAccessible(true);
		return f.get(bean).toString();
	}
	
	public static void populate(Object bean,Map properties) throws ReflectiveOperationException, Exception{
		//��ȡ�ֽ������
		Class c = bean.getClass();
		//����Map
		Set<Map.Entry<String, Object>> entrySet = properties.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			try {//try...catch�����������Map���в����ڵ�����ʱ����
				String key=entry.getKey();
				Object val = entry.getValue();
				Field f=c.getDeclaredField(key);
				f.setAccessible(true);
				f.set(bean, val);
			} catch (NoSuchFieldException e) {
			}
		}
	}
}
