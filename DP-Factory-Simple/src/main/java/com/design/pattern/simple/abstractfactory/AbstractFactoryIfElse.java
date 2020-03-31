package com.design.pattern.simple.abstractfactory;

/**
 * 抽象工厂 ，通过if else 实现 
 * @author Roger
 */
public class AbstractFactoryIfElse {

	/**
	 * 抽象工厂具体生成方法
	 * 
	 * @param who
	 *            生产who?
	 * @return Product
	 */
	public static Product getProduct(int who) {
		if (1 == who) {
			return new Product1();
		} else if (2 == who) {
			return new Product2();
		} else {
			return null;
		}
	}

}
