package com.design.pattern.builder;

import com.design.pattern.builder.burger.ChickenBurger;
import com.design.pattern.builder.burger.VegBurger;
import com.design.pattern.builder.colddrink.Coke;
import com.design.pattern.builder.colddrink.Pepsi;

/**
 * 创建套餐信息
 * 
 * @author Roger
 */
public class MealBuilder {

	/**
	 * 创建 【素食汉堡】 和【素食汉堡】套餐
	 * 
	 * @return 当前套餐
	 */
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	/**
	 * 创建【鸡肉汉堡】和【百事可乐】
	 * 
	 * @return 当前套餐
	 */
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
