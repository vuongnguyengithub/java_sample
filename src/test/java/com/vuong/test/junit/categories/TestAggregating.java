package com.vuong.test.junit.categories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	NumberTest.class, OtherTest.class
})
public class TestAggregating  {

}
