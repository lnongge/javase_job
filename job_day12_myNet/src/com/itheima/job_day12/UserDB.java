package com.itheima.job_day12;

import java.util.ArrayList;

public class UserDB {
	static ArrayList<User> list=new ArrayList<User>();
	static{
		list.add(new User("������","111111"));
		list.add(new User("�����","999999"));
		list.add(new User("����Ⱥ","000000"));
		list.add(new User("������","777777"));
	}
	public static ArrayList<User> getList(){
		return list;
	}
}
