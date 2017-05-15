package com.vuong.pattern.singleton;

public class Singleton6_BillPugh {
	private Singleton6_BillPugh() {
	}

	public static Singleton6_BillPugh getInstance() {
		return Helper.INSTANCE;
	}

	private static class Helper {
		private static final Singleton6_BillPugh INSTANCE = new Singleton6_BillPugh();
	}
}
