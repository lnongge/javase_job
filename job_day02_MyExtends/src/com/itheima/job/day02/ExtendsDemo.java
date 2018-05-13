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
		//System.out.println(agent+"代理的"+version+"版本的"+name+"游戏启动");
		System.out.println("游戏启动");
	}
	public void closeGame(){
		//System.out.println(agent+"代理的"+version+"版本的"+name+"游戏关闭");
		System.out.println("游戏关闭");
	}
}
class Dota extends Games{
	
}
class LOL extends Games{
	
}

