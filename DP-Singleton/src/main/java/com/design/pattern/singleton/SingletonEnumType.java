package com.design.pattern.singleton;

/**
 * 枚举 单例模式 特点：线程安全，调用效率高，不能延迟加载，避免反射和反序列号漏洞
 * 
 * @author Roger
 */
public enum SingletonEnumType {
	/**
	 * 这个枚举原始，本身就是单例模式
	 */
	INSTANCE;
	// 添加自己需要的操作
	public void singletonOperation() {
		System.out.println("这是一个枚举单列");
	}
}