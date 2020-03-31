package com.design.pattern.singleton;

/**
 * 静态内部类法 单例模式 特点：线程安全，调用效率高，可以延迟加载
 *
 * @author Roger
 */
public class SingletonStaticInnerClassType {
	// 初始化SingletonStaticInnerClassType类时不会初始化该内部类，实现延迟加载
	private static class SingletonInstance {
		private static SingletonStaticInnerClassType instance = new SingletonStaticInnerClassType();
	}

	private SingletonStaticInnerClassType() { // 私有构造器
	}

	public static SingletonStaticInnerClassType getInstance() {
		return SingletonInstance.instance;
	}
}