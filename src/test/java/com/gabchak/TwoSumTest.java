package com.gabchak;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void twoSum() {
        int[] inputArray = {2, 7, 11, 15};
        int[] resultIndexes = {0, 1};
        int target = 9;

        Assert.assertArrayEquals(resultIndexes, twoSum.twoSum(inputArray, target));
    }

    @Test
    void twoSum2() {
        int[] inputArray = {3, 3};
        int[] resultIndexes = {0, 1};
        int target = 6;

        Assert.assertArrayEquals(resultIndexes, twoSum.twoSum(inputArray, target));
    }
}