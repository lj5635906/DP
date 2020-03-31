package com.design.pattern.method.two;

import com.design.pattern.method.Translate;
import com.design.pattern.method.TranslateEnglish;

/**
 * 英文打印实体
 * 
 * @author Roger
 */
public class FactoryMethodEnglish extends FactoryMethod {

	@Override
	protected Translate create() {
		return new TranslateEnglish();
	}

}
