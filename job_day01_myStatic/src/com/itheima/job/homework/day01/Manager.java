package com.itheima.job.homework.day01;

public class Manager {
	private String name;
	private String id;
	private int salary;
	private int bonus;
	public Manager() {
	}
	public Manager(String name, String id, int salary, int bonus) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
	}
	public void work(){
		System.out.println("����Ϊ"+id+",����нˮ"+salary+"Ԫ,����Ϊ"+bonus+"Ԫ����Ŀ����"+name+"���ڿ��ų���Աд����");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
