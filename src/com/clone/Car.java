package com.clone;

import java.io.Serializable;

/**
 * 汽车类
 * @author chen
 *
 */
public class Car implements Serializable{

	private static final long serialVersionUID = 1L;
	private String brand;      // 品牌
	private int maxSpeed;      // 最高时速
	public Car() {
		super();
	}
	public Car(String brand, int maxSpeed) {
		super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	
}
