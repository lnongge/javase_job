package com.itheima.job.homework.day01;

public class Cycle {
	private int radius;

	public Cycle() {
	}

	public Cycle(int radius) {
		this.radius = radius;
	}

	public double getLength(){
		return 2*Math.PI*radius;
	}
	public double getSize(){
		return Math.PI*radius*radius;
	}
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
