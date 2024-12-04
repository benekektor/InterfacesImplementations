package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayDoubleProcessorTest {

    @Test
    void testFindMax() {
        ArrayDoubleProcessor processor = new ArrayDoubleProcessorImpl();
        double[] array = {1.5, 3.2, -4.8, 7.1, 0.0};

        assertEquals(7.1, processor.findMax(array));
    }

    @Test
    void testFindMin() {
        ArrayDoubleProcessor processor = new ArrayDoubleProcessorImpl();
        double[] array = {1.5, 3.2, -4.8, 7.1, 0.0};

        assertEquals(-4.8, processor.findMin(array));
    }

    @Test
    void testCalculateAverage() {
        ArrayDoubleProcessor processor = new ArrayDoubleProcessorImpl();
        double[] array = {1.5, 3.2, -4.8, 7.1, 0.0};

        assertEquals(1.4, processor.calculateAverage(array), 0.001);
    }
}
