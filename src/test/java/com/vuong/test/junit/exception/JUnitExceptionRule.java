package com.vuong.test.junit.exception;

import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnitExceptionRule {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void test() {
		expectedException.expect(NullPointerException.class);
		throwEx();
	}
	
	
	private void throwEx() {
		String s = null;
		s.getBytes();
	}
}
