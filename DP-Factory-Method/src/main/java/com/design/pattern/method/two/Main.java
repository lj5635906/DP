package com.design.pattern.method.two;

public class Main {

	public static void main(String[] args) {
		
		FactoryMethod fmchina = new FactoryMethodChina();
		System.out.println(fmchina.sayTxt("测试"));
		
		FactoryMethod fmenglish = new FactoryMethodEnglish();
		System.out.println(fmenglish.sayTxt("测试"));
		
	}

}
