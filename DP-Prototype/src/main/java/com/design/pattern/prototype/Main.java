package com.design.pattern.prototype;

public class Main {

	public static void main(String[] args) {

		Address address = new Address();
		address.setAddress("旧地址");
		Product p = new Product();
		p.setNum(1);
		p.setPrice(0.1);
		p.setRebate(0.1);
		p.setAddress(address);
		System.out.println("原来的对象 ---> " + p.toString());

		Product p2 = p;
		p2.setNum(2);
		p2.setPrice(0.2);
		p2.setRebate(0.2);
		p2.getAddress().setAddress("新地址");
		System.out.println("新的对象 ---> " + p2.toString());

		// 对象为地址传递，新对象改变后原来对象随之改变
		System.out.println("修改后    p ---> " + p.toString());
		System.out.println("修改后    p2 ---> " + p2.toString());

		System.out.println(p == p2);

	}

}
