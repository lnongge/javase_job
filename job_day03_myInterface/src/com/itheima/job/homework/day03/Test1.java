package com.itheima.job.homework.day03;
/*第一题：根据需求完成代码:
	1.定义手机类Phone类
		行为:
			打电话call(),
			发短信sendMess()
	2.定义接口IPlay
		行为:
			玩游戏playGame()
	3.定义旧手机类OldPhone类继承手机类Phone
		行为:
			继承父类的行为
	4.定义新手机继承手机类NewPhone实现IPlay接口
	行为:继承父类的行为,重写玩游戏方法playGame()
	5.定义测试类
		在测试类中定义一个方法：usePhone(参数),要求该方法既能接收老手机对象,也能接收新手机对象
		在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法
		main方法中调用usePhone(参数)方法，分别传递新手机和老手机对象，打印格式如下：
			新手机：
			打电话
			手机发短息 
			新手机打游戏
			------------
			旧手机：
			打电话
			手机发短息 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("新手机:");
		usePhone(new NewPhone());
		System.out.println("------------");
		System.out.println("旧手机:");
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
