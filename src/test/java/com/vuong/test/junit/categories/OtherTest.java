package com.vuong.test.junit.categories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(OddNumber.class)
public class OtherTest {
	
	@Test
	public void isOdd() {
		Assert.assertTrue(true);
	}
	
	
}
