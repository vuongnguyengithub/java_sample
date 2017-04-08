package com.vuong.test.junit.exception;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;


public class JUnitExceptionTryCatch {
	
	@Test
	public void test() {
		try {
			throw new NullPointerException("null");
		} catch (Exception e) {
			assertThat(e, instanceOf(NullPointerException.class));
			assertThat(e.getMessage(), is("null"));
		}
	
	}
	
	@Test
	public void testAssume() {
		Boolean b = false;
		Assume.assumeTrue(b);
		Assert.assertTrue(b);
	}
	
}
