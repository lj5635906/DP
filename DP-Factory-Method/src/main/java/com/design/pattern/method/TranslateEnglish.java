package com.design.pattern.method;

/**
 * 英文打印
 * 
 * @author Roger
 */
public class TranslateEnglish implements Translate {

	@Override
	public String sayTxt(String txt) {
		return "hello " + txt;
	}

}
