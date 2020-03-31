package com.design.pattern.prototype.two;

public class ConcretePrototype2 implements Prototype {

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
