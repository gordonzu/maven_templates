package com.xulu.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void testMain() {
        String[] expected = new String[]{ "Yeah! This is a simple two lines", "Hello World!" }; 
        String[] results = AbstractMainTests.executeMain("com.xulu.test.App", new String[]{"Yeah"});
        assertArrayEquals(expected, results);
    }
}


