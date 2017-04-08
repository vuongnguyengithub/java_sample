package com.vuong.test.junit.paramterized;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitParameterizedWithoutConstructor {
	@Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][] {
                 { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }  
           });
    }
	
    @Parameter
    //@Parameter(0)
    public Integer first;
    
    @Parameter(1)
    public Integer second;
    
    @Test
    public void test() {
    	Assert.assertThat(first, anyOf(is(second), is(second + 1), is(second - 1), is(second - 2) ));
    }
    
}
