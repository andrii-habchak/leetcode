package com.gabchak;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void twoSumBruteForce() {
        int[] inputArray = {2, 7, 11, 15};
        int[] resultIndexes = {0, 1};
        int target = 9;

        Assert.assertArrayEquals(resultIndexes, twoSum.twoSumBruteForce(inputArray, target));
    }

    @Test
    void twoSumBruteForce2() {
        int[] inputArray = {3, 3};
        int[] resultIndexes = {0, 1};
        int target = 6;

        Assert.assertArrayEquals(resultIndexes, twoSum.twoSumBruteForce(inputArray, target));
    }

    @Test
    void twoSumBruteForce3() {
        int[] inputArray = {3, 3, 5, 8, 6, 4};
        int[] resultIndexes = {0, 5};
        int target = 7;

        int[] actuals = twoSum.twoSumBruteForce(inputArray, target);
        Assert.assertArrayEquals(resultIndexes, actuals);
    }

    @Test
    void twoSumWithHashMap() {
        int[] inputArray = {2, 7, 11, 15};
        int[] resultIndexes = {0, 1};
        int target = 9;

        Assert.assertArrayEquals(resultIndexes, twoSum.twoSumUseHashMap(inputArray, target));
    }
}