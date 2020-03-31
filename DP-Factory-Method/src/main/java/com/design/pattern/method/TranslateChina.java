package com.design.pattern.method;

/**
 * 中文打印
 * @author Roger
 */
public class TranslateChina implements Translate {

	@Override
	public String sayTxt(String txt) {
		return "哈喽 " + txt;
	}

}
