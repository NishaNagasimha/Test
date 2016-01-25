package com;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class ResultGeneratorTest {

    ResultGenerator resultGenerator;

    @Mock
    Compute compute;

    @Before
    public void setUp() {
        initMocks(this);
        when(compute.calculateSum(4, 5)).thenReturn(9);
        resultGenerator = new ResultGenerator(compute);
    }

    @Test
    public void shouldGenerateResult() {
        Integer actualResult = resultGenerator.generateSum(4, 5);
        assertEquals(19, (int) actualResult);
    }

}