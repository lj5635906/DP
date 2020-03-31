package com.design.pattern.prototype;

public class MainClone {

	public static void main(String[] args) {
		Address address = new Address();
		address.setAddress("旧地址");
		Product p = new Product();
		p.setNum(1);
		p.setPrice(0.1);
		p.setRebate(0.1);
		p.setAddress(address);
		System.out.println("原来的对象 ---> " + p.toString());

		// 返回一个Porduct对象的一个拷贝
		Product p2 = p.clone();
		System.out.println("拷贝[未]修改的对象 ---> " + p2.toString());
		p2.setNum(2);
		p2.setPrice(0.2);
		p2.setRebate(0.2);
		p2.getAddress().setAddress("新地址");
		System.out.println("拷贝修改的对象 ---> " + p2.toString());
		
		System.out.println("修改后    p ---> " + p.toString());
		System.out.println("修改后    p2 ---> " + p2.toString());

		System.out.println(p == p2);
	}
}
