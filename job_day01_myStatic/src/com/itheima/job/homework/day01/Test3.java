package com.itheima.job.homework.day01;

public class Test3 {
	/*
	 * �����⣺�����������󣬲��ô���ʵ�� Ҫ��:��ɴ���(���ձ�׼��ʽд)��Ȼ���ڲ������в��ԡ� 
	 * 1.�ֻ���Phone����:Ʒ��brand,�۸�price �޲ι���,�вι��� ��Ϊ:��绰call,������sendMessage,����Ϸ,playGame 
	 * 2.�����ഴ��Phone�����,����Phone���еķ���
	 * 
	 * ˼��:�������е��ֻ�����������Ļ�ĳߴ�(int size),���Ҽ��������ֻ�����Ļ�ߴ�Ϊ6,Ӧ�����ʵ��?
	 */
	public static void main(String[] args) {
		Phone.setSize(6);
		Phone p1=new Phone("huawei",2400.0);
		p1.call();
		p1.sendMessage();
		p1.playGame();
		Phone p2=new Phone("oppo",2199.9);
		p2.call();
		p2.sendMessage();
		p2.playGame();
	}
}
