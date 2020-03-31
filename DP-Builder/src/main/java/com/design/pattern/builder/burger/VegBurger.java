package com.design.pattern.builder.burger;

/**
 * 素食汉堡
 * 
 * @author Roger
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "素食汉堡";
	}

	@Override
	public float price() {
		return 18;
	}

}
