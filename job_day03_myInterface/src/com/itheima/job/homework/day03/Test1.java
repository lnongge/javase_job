package com.itheima.job.homework.day03;
/*��һ�⣺����������ɴ���:
	1.�����ֻ���Phone��
		��Ϊ:
			��绰call(),
			������sendMess()
	2.����ӿ�IPlay
		��Ϊ:
			����ϷplayGame()
	3.������ֻ���OldPhone��̳��ֻ���Phone
		��Ϊ:
			�̳и������Ϊ
	4.�������ֻ��̳��ֻ���NewPhoneʵ��IPlay�ӿ�
	��Ϊ:�̳и������Ϊ,��д����Ϸ����playGame()
	5.���������
		�ڲ������ж���һ��������usePhone(����),Ҫ��÷������ܽ������ֻ�����,Ҳ�ܽ������ֻ�����
		�ڸ÷����ڲ����ô�绰,�������Լ����ֻ����е�����Ϸ����
		main�����е���usePhone(����)�������ֱ𴫵����ֻ������ֻ����󣬴�ӡ��ʽ���£�
			���ֻ���
			��绰
			�ֻ�����Ϣ 
			���ֻ�����Ϸ
			------------
			���ֻ���
			��绰
			�ֻ�����Ϣ */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("���ֻ�:");
		usePhone(new NewPhone());
		System.out.println("------------");
		System.out.println("���ֻ�:");
		usePhone(new OldPhone());
	}
	public static void usePhone(Phone p){
		p.call();
		p.sendMess();
		if(p instanceof NewPhone){
			((NewPhone) p).playGame();
		}
	}
}
