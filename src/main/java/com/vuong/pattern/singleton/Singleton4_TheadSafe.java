package com.vuong.pattern.singleton;

public class Singleton4_TheadSafe {
	private static volatile Singleton4_TheadSafe instance;
	private Singleton4_TheadSafe() {
		
	}
	
	public static synchronized Singleton4_TheadSafe getInstance() {
		if (instance == null) {
			instance = new Singleton4_TheadSafe();
		}
		
		return instance;
	}
}
