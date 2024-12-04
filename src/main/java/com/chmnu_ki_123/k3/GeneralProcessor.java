package com.chmnu_ki_123.k3;
import java.util.Arrays;

public class GeneralProcessor implements ArrayDoubleProcessor {
    @Override
    public double findMax(double[] array) {
        return Arrays.stream(array).max().orElseThrow(() -> new IllegalArgumentException("Array cannot be null or empty"));
    }

    @Override
    public double findMin(double[] array) {
        return Arrays.stream(array).min().orElseThrow(() -> new IllegalArgumentException("Array cannot be null or empty"));
    }

    @Override
    public double calculateAverage(double[] array) {
        return Arrays.stream(array).average().orElseThrow(() -> new IllegalArgumentException("Array cannot be null or empty"));
    }
}
