package com.github.felipecao;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SampleTest {

    private Sample sample;

    @Before
    public void setup(){
        sample = new Sample();
    }

    @Test
    public void testSample(){
        String output = sample.getOutput("input");
        assertEquals("input", output);
    }
}
