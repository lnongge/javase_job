package com.itheima.job.homework.day01;

public class Square {
	private int len;
	private int wid;
	public Square() {
	}
	public Square(int len, int wid) {
		this.len = len;
		this.wid = wid;
	}
	public int getLength(){
		return (len+wid)*2;
	}
	public int getSize(){
		return len*wid;
	}
	/**
	 * @return the len
	 */
	public int getLen() {
		return len;
	}
	/**
	 * @param len the len to set
	 */
	public void setLen(int len) {
		this.len = len;
	}
	/**
	 * @return the wid
	 */
	public int getWid() {
		return wid;
	}
	/**
	 * @param wid the wid to set
	 */
	public void setWid(int wid) {
		this.wid = wid;
	}
	
}
