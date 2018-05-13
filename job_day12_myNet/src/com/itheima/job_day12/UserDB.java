package com.itheima.job_day12;

import java.util.ArrayList;

public class UserDB {
	static ArrayList<User> list=new ArrayList<User>();
	static{
		list.add(new User("左冷禅","111111"));
		list.add(new User("令狐冲","999999"));
		list.add(new User("岳不群","000000"));
		list.add(new User("任我行","777777"));
	}
	public static ArrayList<User> getList(){
		return list;
	}
}
