package com.design.pattern.method.two;

import com.design.pattern.method.Translate;

/**
 * 创建Translate对象是还不知道具体的实现是哪一个，使用抽象方法实现
 * 
 * @author Roger
 */
public abstract class FactoryMethod {

	protected abstract Translate create();

	public String sayTxt(String txt) {
		Translate t = this.create();
		return t.sayTxt(txt);
	}

}
