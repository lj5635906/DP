package com.design.pattern.prototype;

/**
 * 产品
 * 
 * @author Roger
 */
public class Product implements Cloneable {

	private int num;

	private double price;

	private double rebate;
	
	private Address address;

	@Override
	public String toString() {
		return "Product [num=" + num + ", price=" + price + ", rebate="
				+ rebate + ", address=" + address + "]";
	}

	public Product clone() {
		Product obj = null;
		try {
			obj = (Product) super.clone();
			Address address = obj.getAddress().clone();
			obj.setAddress(address);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

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

	public double getRebate() {
		return rebate;
	}

	public void setRebate(double rebate) {
		this.rebate = rebate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
