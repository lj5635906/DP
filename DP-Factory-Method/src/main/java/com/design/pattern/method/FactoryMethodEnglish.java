package com.design.pattern.method;

/**
 * 工厂抽象接口实现   英文打印实体对象
 * 
 * @author Roger
 */
public class FactoryMethodEnglish implements FactoryMethod{

	@Override
	public Translate create() {
		return new TranslateEnglish();
	}

}
