package com.itheima.job_day05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	/*������xminͼ����չ��
	 * 1.String s="����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
	 * 	��д�������:��Ҫѧ���
	 * 2.String s = "�ҵ��ֻ���18511866260,�����ù�18987654321,���ù�18812345678";
	 * 	����������������ֻ���
	 * */
	public static void main(String[] args) {
		String s1="����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String rs=s1.replaceAll("[��Ҫѧ���.][��Ҫѧ���.]+", "��Ҫѧ���");
		System.out.println(rs);
		
		/*String str = "Hello12345World6789012";
		str = str.replaceAll("[\\d]+", "#");
		System.out.println(str);*/
		
		//�ڶ���
		String s2 = "�ҵ��ֻ���18511866260,�����ù�18987654321,���ù�18812345678";
		String regex="1[34578]\\d{9}";
		Matcher m=Pattern.compile(regex).matcher(s2);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
