package com.itheima.job.homework.day02;

public class Test3 {
	/*第三题：分析以下需求，并用代码实现
	1.已知学生类和老师类如下：
		属性:
			姓名,年龄
		行为:
			吃饭
		老师有特有的方法:
			讲课
		学生有特有的方法:
			学习
	2.要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
		编写测试类:完成这两个类的测试*/
	public static void main(String[] args) {
		Teacher t=new Teacher("小龙女",20);
		t.eat();
		t.teach();
		Student1 s1=new Student1();
		s1.setName("杨过");
		s1.setAge(18);
		s1.eat();
		s1.learn();
		
	}
}
