package com.design.pattern.builder.burger;

/**
 * 鸡肉汉堡
 * 
 * @author Roger
 */
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "鸡肉汉堡";
	}

	@Override
	public float price() {
		return 25;
	}

}
