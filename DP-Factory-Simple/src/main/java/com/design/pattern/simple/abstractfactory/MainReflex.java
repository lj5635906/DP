package com.design.pattern.simple.abstractfactory;

public class MainReflex {
	
	public static void main(String[] args) {
		
		Product p1 = AbstractFactoryReflex.getProduct("com.design.pattern.simple.abstractfactory.Product1");
		Product p2 = AbstractFactoryReflex.getProduct("com.design.pattern.simple.abstractfactory.Product2");
		
		p1.operation();
		p2.operation();
	}
}
