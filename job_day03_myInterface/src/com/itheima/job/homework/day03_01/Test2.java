package com.itheima.job.homework.day03_01;
/*�ڶ��⣺����������ɴ���:
	1.���嶯����Animal
		���ԣ�
			����age����ɫcolor
		��Ϊ:
			eat(String something)����
			(�޾�����Ϊ,��ͬ����Եķ�ʽ�Ͷ�����һ��,something��ʾ�ԵĶ���)
		���ɿղ��вι��죬set��get����
	2.���幷��Dog�̳ж�����Animal
		��Ϊ:
			eat(String something)����,
			����lookHome����(�޲���),����������"������"
	3.����è��Cat�̳ж�����Animal
		��Ϊ:
			eat(String something)����,
			������catchMouse����(�޲���), ����������"èץ����"
	4.����Person��
		���ԣ�
			����������
		��Ϊ��
			keepPet(Dog dog,String something)����,���������ݲ��ղ������ӡ�����
				���ܣ�ι�����ﹷ��something��ʾι���Ķ���
		��Ϊ��
			keepPet(Cat cat,String something)����,���������ݲ��ղ������ӡ�����
				���ܣ�ι������è��something��ʾι���Ķ���
		���ɿղ��вι��죬set��get����  
	5.���������(������´�ӡЧ��):
		keepPet(Dog dog,String somethind)������ӡ�������£�
			����Ϊ30�����������һֻ����ɫ��2��ĳ���,2��ĺ���ɫ�Ĺ���ֻǰ�������ı�ס��ͷ�ͳ�

		keepPet(Cat cat,String somethind)������ӡ�������£�
			����Ϊ25�����������һֻ����ɫ��3��ĳ���,3��Ļ���ɫ��è�����۾�����ͷ����
	6.˼����		
		1.Dog��Cat����Animal�����࣬���ϰ�������Բ�ͬ�Ķ�������˲�ͬ��keepPet���������ڷ������ܷ�򻯣������򻯺�ĺô���--��̬
		2.Dog��Cat��Ȼ����Animal�����࣬���Ƕ��������з������ܷ���취��keepPet�е������з�����--ǿת
	ps:������ֱ�����޸ĺ������	
*/
public class Test2 {
	public static void main(String[] args) {
		Person p1=new Person("����",30);
		p1.KeepPet(new Dog(2,"��"), "��ͷ");
		Person p2=new Person("����",25);
		p2.KeepPet(new Cat(3,"��"), "��");
	}
}
