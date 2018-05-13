package com.itheima.job.homework.day03_02;
/*第三题：根据需求完成代码:
	1.定义动物类Animal：
		行为：
			吼叫speak()；没有具体的吼叫行为
			吃饭eat():没有具体的吃饭行为
	2.定义缉毒接口JD 
		行为: 
			缉毒jD()
	3.定义缉毒狗:犬的一种
		行为：
			吼叫speak():汪汪叫
			吃饭eat():狗啃骨头
			缉毒jD():用鼻子侦测毒
	4.定义测试类:
		使用多态的形式创建缉毒狗对象,调用吃饭、吼叫和缉毒方法
		打印内容如下：
			狗啃骨头
			汪汪叫
			用鼻子侦测毒*/
public class Test3 {
	public static void main(String[] args) {
		JDDog jddog=new JDDog();
		jddog.eat();
		jddog.speak();
		jddog.JD();
	}
}
