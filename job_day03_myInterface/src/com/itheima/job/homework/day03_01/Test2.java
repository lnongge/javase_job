package com.itheima.job.homework.day03_01;
/*第二题：根据需求完成代码:
	1.定义动物类Animal
		属性：
			年龄age，颜色color
		行为:
			eat(String something)方法
			(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
		生成空参有参构造，set和get方法
	2.定义狗类Dog继承动物类Animal
		行为:
			eat(String something)方法,
			看家lookHome方法(无参数),方法内容是"狗看家"
	3.定义猫类Cat继承动物类Animal
		行为:
			eat(String something)方法,
			逮老鼠catchMouse方法(无参数), 方法内容是"猫抓老鼠"
	4.定义Person类
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法,方法体内容参照测试类打印结果看
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法,方法体内容参照测试类打印结果看
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法  
	5.定义测试类(完成以下打印效果):
		keepPet(Dog dog,String somethind)方法打印内容如下：
			年龄为30岁的老王养了一只黑颜色的2岁的宠物,2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃

		keepPet(Cat cat,String somethind)方法打印内容如下：
			年龄为25岁的老李养了一只灰颜色的3岁的宠物,3岁的灰颜色的猫眯着眼睛侧着头吃鱼
	6.思考：		
		1.Dog和Cat都是Animal的子类，以上案例中针对不同的动物，定义了不同的keepPet方法，过于繁琐，能否简化，并体会简化后的好处？--多态
		2.Dog和Cat虽然都是Animal的子类，但是都有其特有方法，能否想办法在keepPet中调用特有方法？--强转
	ps:本题我直接做修改后的做法	
*/
public class Test2 {
	public static void main(String[] args) {
		Person p1=new Person("老王",30);
		p1.KeepPet(new Dog(2,"黑"), "骨头");
		Person p2=new Person("老李",25);
		p2.KeepPet(new Cat(3,"灰"), "鱼");
	}
}
