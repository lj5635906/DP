package com.design.pattern.builder.colddrink;

/**
 *可口可乐
 * @author Roger
 */
public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "可口可乐";
	}

	@Override
	public float price() {
		return 8;
	}

}
