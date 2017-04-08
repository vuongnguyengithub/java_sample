package com.vuong.test.junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({NumberTest.class, OtherTest.class})
@ExcludeCategory({EvenNumer.class})
public class TestALl {
}
