package com.itheima.job.homework.day01;

public class Phone {
	private String brand;
	private double price;
	private static int size;
	public Phone() {
	}
	public Phone(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public void call(){
		System.out.println("正在使用"+price+"块钱的"+size+"寸的"+brand+"手机打电话");
	}
	public void sendMessage(){
		System.out.println("正在使用"+price+"块钱的"+size+"寸的"+brand+"手机发短息");
	}
	public void playGame(){
		System.out.println("正在使用"+price+"块钱的"+size+"寸的"+brand+"手机玩游戏");
	}
	/**
	 * @return the size
	 */
	public static int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public static void setSize(int size) {
		Phone.size = size;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
