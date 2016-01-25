package com;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComputeTest {
    Compute compute;

    @BeforeClass
    public void setUp() {
        compute = new Compute();
    }

    @Test
    public void shouldComputeTheSumOfTwoNumbers() {
        Integer actualResult = compute.calculateSum(4, 5);

        assertEquals(9, (int) actualResult);
    }


}
