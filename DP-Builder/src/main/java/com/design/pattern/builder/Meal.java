package com.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐数据
 * 
 * @author Roger
 */
public class Meal {

	/**
	 * 当前套餐所有食物条目
	 */
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}