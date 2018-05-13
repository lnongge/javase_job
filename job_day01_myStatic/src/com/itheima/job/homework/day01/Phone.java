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
		System.out.println("����ʹ��"+price+"��Ǯ��"+size+"���"+brand+"�ֻ���绰");
	}
	public void sendMessage(){
		System.out.println("����ʹ��"+price+"��Ǯ��"+size+"���"+brand+"�ֻ�����Ϣ");
	}
	public void playGame(){
		System.out.println("����ʹ��"+price+"��Ǯ��"+size+"���"+brand+"�ֻ�����Ϸ");
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
