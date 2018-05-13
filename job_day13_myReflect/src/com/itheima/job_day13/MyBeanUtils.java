package com.itheima.job_day13;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyBeanUtils {
	/*自己写的工具类实现BeanUtils的功能
	 * 工具类:1.构造私有2.所有成员static修饰
	 * */
	private MyBeanUtils(){};
	public static void setProperty(Object bean,String name,Object value) throws ReflectiveOperationException, SecurityException{
		//获取字节码对象
		Class c=bean.getClass();
		//获取字段
		Field f=c.getDeclaredField("name");
		f.setAccessible(true);
		//设置值
		f.set(bean, value);
	}
	public static String getProperty(Object bean,String name) throws ReflectiveOperationException, Exception{
		//获取字节码对象
		Class c=bean.getClass();
		//获取字段
		Field f=c.getDeclaredField("name");
		f.setAccessible(true);
		return f.get(bean).toString();
	}
	
	public static void populate(Object bean,Map properties) throws ReflectiveOperationException, Exception{
		//获取字节码对象
		Class c = bean.getClass();
		//解析Map
		Set<Map.Entry<String, Object>> entrySet = properties.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			try {//try...catch是用来解决当Map中有不存在的属性时报错
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
