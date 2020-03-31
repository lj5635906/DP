package com.design.pattern.simple;

/**
 * 产品
 * 
 * @author Roger
 */
public class Product {

	private int num;

	private double price;

	private double rebate;

	private double total;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		this.total = this.getNum() * this.getPrice() * this.getRebate();
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getRebate() {
		return rebate;
	}

	public void setRebate(double rebate) {
		this.rebate = rebate;
	}

}
