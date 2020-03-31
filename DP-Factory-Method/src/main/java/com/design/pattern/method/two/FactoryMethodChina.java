package com.design.pattern.method.two;

import com.design.pattern.method.Translate;
import com.design.pattern.method.TranslateChina;

/**
 * 中文打印实现
 * 
 * @author Roger
 */
public class FactoryMethodChina extends FactoryMethod {

	@Override
	protected Translate create() {
		return new TranslateChina();
	}

}
