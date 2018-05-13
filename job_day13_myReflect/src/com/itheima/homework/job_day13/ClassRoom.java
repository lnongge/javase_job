package com.itheima.homework.job_day13;

import java.io.Serializable;
import java.util.Arrays;

public class ClassRoom implements Serializable {
	private static final long serialVersionUID = 1L;
	private int classNo;
	private String className;
	private int stuCount;
	private String[] stuName;
	public ClassRoom() {
	}
	public ClassRoom(int classNo, String className, int stuCount, String[] stuName) {
		this.classNo = classNo;
		this.className = className;
		this.stuCount = stuCount;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "ClassRoom [classNo=" + classNo + ", " + (className != null ? "className=" + className + ", " : "")
				+ "stuCount=" + stuCount + ", " + (stuName != null
						? "stuName=" + Arrays.asList(stuName).subList(0, Math.min(stuName.length, maxLen)) : "")
				+ "]";
	}
	/**
	 * @return the classNo
	 */
	public int getClassNo() {
		return classNo;
	}
	/**
	 * @param classNo the classNo to set
	 */
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the stuCount
	 */
	public int getStuCount() {
		return stuCount;
	}
	/**
	 * @param stuCount the stuCount to set
	 */
	public void setStuCount(int stuCount) {
		this.stuCount = stuCount;
	}
	/**
	 * @return the stuName
	 */
	public String[] getStuName() {
		return stuName;
	}
	/**
	 * @param stuName the stuName to set
	 */
	public void setStuName(String[] stuName) {
		this.stuName = stuName;
	}
	
}
