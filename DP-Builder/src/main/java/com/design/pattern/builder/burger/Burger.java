package com.design.pattern.builder.burger;

import com.design.pattern.builder.Item;
import com.design.pattern.builder.packing.Packing;
import com.design.pattern.builder.packing.Wrapper;

/**
 * 汉堡
 * 
 * @author Roger
 */
public abstract class Burger implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
