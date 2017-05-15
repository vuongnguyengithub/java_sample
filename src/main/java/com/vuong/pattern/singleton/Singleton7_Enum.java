package com.vuong.pattern.singleton;

//Cant be lazy load :))
public enum Singleton7_Enum {
	
	INSTANCE;
	
	public static void doSomething() {
		System.out.println(INSTANCE.hashCode());
	}
 }
