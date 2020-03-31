package com.design.pattern.simple.abstractfactory;

public class MainIfElse {
	
	public static void main(String[] args) {
		
		Product p1 = AbstractFactoryIfElse.getProduct(1);
		Product p2 = AbstractFactoryIfElse.getProduct(2);
		
		p1.operation();
		p2.operation();
	}
}
