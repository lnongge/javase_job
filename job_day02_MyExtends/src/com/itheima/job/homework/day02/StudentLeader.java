package com.itheima.job.homework.day02;

public class StudentLeader extends Student {
	private String job;

	public StudentLeader() {
		super();
	}

	public StudentLeader(String name, String gender, int age, String nationality, String school, String stuNumber,String job) {
		super(name, gender, age, nationality, school, stuNumber);
		this.job=job;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	public void meeting() {
		System.out.println(getAge()+"岁的"+getNationality()+getSchool()+getGender()+"学生会"+job+getName()+"喜欢开会!");
	}
}
