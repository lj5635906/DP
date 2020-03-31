package com.design.pattern.singleton;

/**
 * 双重检查锁单例模式 特点：非线程安全，偶尔会出现问题，不建议使用
 * 
 * @author Roger
 */
public class SingletonDuplicationCheck {
	private static volatile SingletonDuplicationCheck singleton = null;

	private SingletonDuplicationCheck() {
	}

	public static SingletonDuplicationCheck getSingleton() {
		if (singleton == null) {
			synchronized (SingletonDuplicationCheck.class) {
				if (singleton == null) {
					singleton = new SingletonDuplicationCheck();
				}
			}
		}
		return singleton;
	}
}