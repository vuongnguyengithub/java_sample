package com.vuong.pattern.singleton;

/**
 * Create new instance every time ? handle exception;
 */
public class Singleton1_EagerInitialization {

	private Singleton1_EagerInitialization() {

	}

	public static Singleton1_EagerInitialization getInstance() {
		return new Singleton1_EagerInitialization();
	}

}
