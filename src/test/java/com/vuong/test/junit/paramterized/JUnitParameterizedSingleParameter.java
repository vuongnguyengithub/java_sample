package com.vuong.test.junit.paramterized;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitParameterizedSingleParameter {
	
	@Parameters(name ="{index}: test({0})")
	public static Iterable<Integer> init() {
		return Arrays.asList(1,2);
	}
	
	@Parameter(0)
	public Integer first;
	
	
	@Test
	public void test() {
		assertThat(first, instanceOf(Integer.class));
	}
}
