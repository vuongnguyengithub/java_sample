package com.vuong.pattern.singleton;

public class Singleton2_StaticBlockInitialization {
	
	private static Singleton2_StaticBlockInitialization instance;
	private Singleton2_StaticBlockInitialization() {
	}
	
	static {
		instance = new Singleton2_StaticBlockInitialization();
	}
	
	public Singleton2_StaticBlockInitialization getInstance() {
		return instance;
	}
 }
