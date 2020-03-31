package com.design.pattern.method;

/**
 * 工厂抽象接口实现  中文打印对象
 * 
 * @author Roger
 */
public class FactoryMethodChina implements FactoryMethod {

	@Override
	public Translate create() {
		return new TranslateChina();
	}

}
