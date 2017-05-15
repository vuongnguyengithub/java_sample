package com.vuong.pattern.singleton;

import java.time.LocalDateTime;
import java.util.Date;

public class Singleton3_Lazy {
	
	private static Singleton3_Lazy instance;
	
	private Singleton3_Lazy() {}
	
	public static Singleton3_Lazy getInstance() {
		if (instance == null) {
			instance = new Singleton3_Lazy();
		} 
		
		return instance;
	}
	
	public Date getDate() {
		return new Date();
	}
	
	public LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}
}
