package com.vuong.test.junit.assertion;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class JUnitAssertion {
	
	@Test
	public void testAssertTrue() {
		Object expected = "Vuong";
		Object actual = "Vuong";
		Assert.assertTrue(expected == actual);
		Assert.assertTrue("Should not be false", expected == actual);
	}
	
	@Test
	public void testAssertThat() {
		String expected = "Vuong";
		String actual = "Vuong";
		Assert.assertThat(actual, equalTo(expected));
		Assert.assertThat(actual, containsString("Vuong"));
	}
	
	@Test
	public void testAssertSameNotSame() {
		String expected = "Vuong";
		String actual = "Vuong";
		assertSame("Should be the same", expected, actual);
		actual = new String("Vuong");
		assertEquals(expected, actual);
		assertNotSame("Should be the same", expected, actual);
	}
	
	@Test
	public void testAssertNullNotNull() {
		String expected = null;
		assertNull(expected);
		assertNull("Should be null" ,expected);
		expected = "";
		assertNotNull(expected);
		assertNotNull("Should not be nul", expected);
	}
	
	@Test
	public void testAssertFalseTrueEqualsNotEquals() {
		String expected = "";
		String actual = "";
		Assert.assertFalse(expected != actual);
		Assert.assertTrue(expected == actual);
		Assert.assertEquals(expected, actual);
		actual = new String("z");
		assertNotEquals("Should be equal", expected, actual);
	}
	
	@Test
	public void testAssertArray() {
		int[] fibonacci1 = new int[]{1,1,2,3,5,8};
		int[] fibonacci2 = new int[]{1,1,2,3,5,8};
		assertArrayEquals(fibonacci1, fibonacci2);
	}
	
	/*
 	import static org.hamcrest.CoreMatchers.allOf;
	import static org.hamcrest.CoreMatchers.anyOf;
	import static org.hamcrest.CoreMatchers.both;
	import static org.hamcrest.CoreMatchers.containsString;
	import static org.hamcrest.CoreMatchers.equalTo;
	import static org.hamcrest.CoreMatchers.everyItem;
	import static org.hamcrest.CoreMatchers.hasItems;
	import static org.hamcrest.CoreMatchers.not;
	import static org.hamcrest.CoreMatchers.sameInstance;
	import static org.hamcrest.CoreMatchers.startsWith;
 */


	@Test
	public void testMatcher() {
		String actual = "Vuong";
		assertThat(actual, startsWith("V"));
		assertThat(actual, sameInstance("Vuong"));
		assertThat(actual, allOf(equalTo("Vuong"), startsWith("V")));
		assertThat(actual, not(sameInstance(new String("Vuong"))));
		assertThat(actual, anyOf(startsWith("N"), startsWith("V")));
		assertThat(actual, both(startsWith("V")).and(endsWith("g")));
		assertThat(actual, is("Vuong"));
		assertThat(actual, is(new String("Vuong")));
		String s = null;
		assertThat(null, is(s));
	
	}
}
