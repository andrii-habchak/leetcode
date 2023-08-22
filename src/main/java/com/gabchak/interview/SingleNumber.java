package com.gabchak.interview;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int unique = nums[0];
        for (int i = 1; i < nums.length; i++) {
            unique = unique ^ nums[i];
        }
        return unique;
    }
}
