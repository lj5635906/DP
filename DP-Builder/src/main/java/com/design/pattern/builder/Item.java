package com.design.pattern.builder;

import com.design.pattern.builder.packing.Packing;

/**
 * 食物条目
 * 
 * @author Roger
 */
public interface Item {

	/**
	 * 食物名称
	 */
	public String name();

	/**
	 * 食物包装
	 */
	public Packing packing();

	/**
	 * 食物价格
	 */
	public float price();

}
