package com.vuong.pattern.singleton;

public class Singleton5_DoubleCheck {
	private static Singleton5_DoubleCheck instance;

	private Singleton5_DoubleCheck() {
	}

	public static Singleton5_DoubleCheck getInstance() {
		if (instance == null) {
			synchronized (Singleton5_DoubleCheck.class) {
				if (instance == null) {
					instance = new Singleton5_DoubleCheck();
				}
			}
		}

		return instance;
	}
}
