package com.design.pattern.singleton;

/**
 * 懒汉式单例模式 特点：线程安全，调用效率不高，可以延迟加载
 * 
 * @author Roger
 */
public class SingletonLazyTyep {

	// 类初始化时，不初始化,延迟加载
	private static SingletonLazyTyep instance = null;

	private SingletonLazyTyep() { // 私有构造器
	}

	// 方法同步，调用效率低
	public static synchronized SingletonLazyTyep getInstance() {
		if (instance == null) {
			instance = new SingletonLazyTyep();
		}
		return instance;
	}
}