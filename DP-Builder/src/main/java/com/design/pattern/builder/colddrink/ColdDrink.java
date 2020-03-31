package com.design.pattern.builder.colddrink;

import com.design.pattern.builder.Item;
import com.design.pattern.builder.packing.Bottle;
import com.design.pattern.builder.packing.Packing;

/**
 * 冷饮
 * 
 * @author Roger
 */
public abstract class ColdDrink implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
