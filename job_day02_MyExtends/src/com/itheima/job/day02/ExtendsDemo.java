package com.itheima.job.day02;

public class ExtendsDemo {
	public static void main(String[] args) {
		Dota d=new Dota();
		d.startGame();
		d.closeGame();
		LOL l=new LOL();
		l.startGame();
		l.closeGame();
	}
}
class Games{
	String name;
	double version;
	String agent;
	public void startGame(){
		//System.out.println(agent+"�����"+version+"�汾��"+name+"��Ϸ����");
		System.out.println("��Ϸ����");
	}
	public void closeGame(){
		//System.out.println(agent+"�����"+version+"�汾��"+name+"��Ϸ�ر�");
		System.out.println("��Ϸ�ر�");
	}
}
class Dota extends Games{
	
}
class LOL extends Games{
	
}

