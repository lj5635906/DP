package com.design.pattern.simple;

/**
 * 简单工厂模式
 * 
 * @author Roger
 */
public class SimpleFactory {

	/**
	 * 获取总价格
	 * 
	 * @param num
	 *            数量
	 * @param price
	 *            单价
	 * @param rebate
	 *            折扣
	 * @return 总价格
	 */
	public static double getTotal(int num, double price, double rebate) {
		Product p = new Product();
		p.setNum(num);
		p.setPrice(price);
		p.setRebate(rebate);
		return p.getTotal();
	}

}
