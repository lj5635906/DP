package com.design.pattern.prototype;

public class Address implements Cloneable{

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
	public Address clone(){
		Address address = null;
		try {
			address = (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return address;
	}

}
