package com.vuong.test.junit.paramterized;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitParameterized {
	
	private String firstName;
	private String lastName;
	
	public JUnitParameterized(String s, String ss) {
		firstName = s;
		lastName = ss;
	}
	
	@Parameters
	public static Collection<Object[]> init() {
		String firstName = "Vuong";
		String lastName = "Nguyen";
		return Arrays.asList( new Object[][]{{firstName, lastName}});
	}
	
	
	@Test
	public void testAssertEqual() {
		Assert.assertThat(firstName, Is.is("Vuong"));
		Assert.assertThat(lastName, Is.is("Nguyen"));
	}
}
