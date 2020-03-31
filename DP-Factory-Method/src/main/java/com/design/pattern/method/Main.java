package com.design.pattern.method;

public class Main {

	public static void main(String[] args) {

		FactoryMethod fmchina = new FactoryMethodChina();
		Translate tchina = fmchina.create();
		System.out.println(tchina.sayTxt("测试"));

		FactoryMethod fmenglish = new FactoryMethodEnglish();
		Translate tenglish = fmenglish.create();
		System.out.println(tenglish.sayTxt("测试"));

	}

}
