package com.vuong.test.junit.exception;

import org.junit.Test;

public class JUnitExceptionExpected {
	
	@Test(expected = NullPointerException.class)
	public void test() {
		String s = null;
		s.equals("d");
	}
}
