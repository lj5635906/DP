package com.design.pattern.simple.abstractfactory;

/**
 * 抽象工厂 ，通过反射实现
 * 
 * @author Roger
 */
public class AbstractFactoryReflex {

	/**
	 * 抽象工厂具体生成方法
	 * 
	 * @param whoName
	 *            全限定类名
	 * @return Product
	 */
	public static Product getProduct(String whoName) {
		Product p = null;
		try {
			p = (Product) Class.forName(whoName).newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return p;
	}

}
