package com.itheima.job_day07;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	/*模拟斗地主发牌
	 * 买牌
	 * 洗牌
	 * 发牌
	 * */
	public static void main(String[] args) {
	//1.买牌
		//花色
		String[] color ={"黑桃","红桃","方块","梅花"};
		//颜色
		String[] nums={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//牌盒
		ArrayList<String> list=new ArrayList<>();
		for (int i = 0; i < color.length; i++) {
			String s=color[i];
			for (int j = 0; j < nums.length; j++) {
				list.add(s+nums[j]);
			}
		}
		list.add("大王");//不要忘记还有大小王
		list.add("小王");
		System.out.println("洗牌前:"+list);
	//2.洗牌
		Collections.shuffle(list);
		System.out.println("洗牌后:"+list);
		
	//3.发牌
		//找3个牌友
		ArrayList<String> 林志玲=new ArrayList<>();
		ArrayList<String> 刘亦菲=new ArrayList<>();
		ArrayList<String> 王祖贤=new ArrayList<>();
		for (int i = 0; i < list.size()-3; i++) {//斗地主要留3张底牌
			String card=list.get(i);
			//3位牌友依次抽牌
			if(i%3==0)
				林志玲.add(card);
			if(i%3==1)
				刘亦菲.add(card);
			if(i%3==2)
				王祖贤.add(card);
		}
		
		//发牌完毕,打印出3个牌友的牌和底牌
		System.out.println("林志玲的牌面值:"+林志玲);
		System.out.println("刘亦菲的牌面值:"+刘亦菲);
		System.out.println("王祖贤的牌面值:"+王祖贤);
		System.out.println("桌面底牌:");
		for (int i = list.size()-3; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
