package com.itheima.job.homework.day02;

public class Test1 {
/*��һ�⣺�����������󣬲��ô���ʵ��
	1.����Person��
		���ԣ�
			����name���Ա�gender������age������nationality��
		�������Է�eat��˯��sleep������work��
	2.�������࣬����һ��ѧ����Student
		�������ԣ�
			ѧУschool��ѧ��stuNumber��
		��д����������ѧ���Ĺ�����ѧϰ����	
	3.�������࣬����һ��������Worker
		�������ԣ�
			��λunit������workAge��
		��д�������������˵Ĺ����ǸǷ��ӣ���
	4.����ѧ���࣬����һ��ѧ���ɲ��� StudentLeader
		�������ԣ�
			ְ��job��
		���ӷ���������meeting��
	5.��д������ֱ������3�����������в��ԡ�
	6.Ҫ�����н��:
		ѧ����Ҫѧϰ!
		���˵Ĺ����ǸǷ���!
		ѧ���ɲ�ϲ������!*/
	public static void main(String[] args) {
		Student s=new Student("�����","��",20,"�й�","��ɽ��","H001");
		s.eat();
		s.work();
		s.sleep();
		Worker w=new Worker("����Ⱥ","����",50,"�й�","��ɽ��",30);
		w.eat();
		w.work();
		w.sleep();
		StudentLeader sl=new StudentLeader();
		sl.setName("��ӯӯ");
		sl.setAge(18);
		sl.setGender("Ů");
		sl.setJob("��ί");
		sl.setNationality("�й�");
		sl.setSchool("�������");
		sl.setStuNumber("R001");
		sl.eat();
		sl.work();
		sl.meeting();
		sl.sleep();
	}
	
	
}
