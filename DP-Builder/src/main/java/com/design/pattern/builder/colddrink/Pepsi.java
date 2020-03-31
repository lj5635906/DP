package com.design.pattern.builder.colddrink;

/**
 * 百事可乐
 * 
 * @author Roger
 */
public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "百事可乐";
	}

	@Override
	public float price() {
		return 10;
	}

}
