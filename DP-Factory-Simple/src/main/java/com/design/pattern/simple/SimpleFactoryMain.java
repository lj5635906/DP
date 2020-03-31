package com.design.pattern.simple;

public class SimpleFactoryMain {

	public static void main(String[] args) {

		Product p = new Product();
		p.setNum(10);
		p.setPrice(2.5);
		// 原来需求,获取总价格
//		System.out.println(p.getNum() * p.getPrice());
		// 新需求,打折
		System.out.println(p.getNum() * p.getPrice() * 0.5);
	}
}
