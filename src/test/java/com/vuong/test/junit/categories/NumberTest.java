package com.vuong.test.junit.categories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(EvenNumer.class)
public class NumberTest {
	
	@Test
	public void testIsNumber(){
		Assert.assertTrue(true);
	}
	
	@Test
	public void testIsEvenNumber() {
		Assert.assertTrue(true);
	}
}
