package com.design.pattern.singleton;

/**
 * 饿汉式单例模式 特点：线程安全，调用效率高，不能延迟加载
 * 
 * @author Roger
 */
public class SingletonHungryType {
	// 类初始化时，立即加载，天然的线程安全
	private static SingletonHungryType instance = new SingletonHungryType();

	private SingletonHungryType() { // 私有构造器
	}

	public static SingletonHungryType getInstance() {
		return instance;
	}
}