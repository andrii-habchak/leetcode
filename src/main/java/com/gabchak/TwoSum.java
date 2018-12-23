package com.gabchak;

//1

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] resultIndex = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultIndex[0] = i;
                    resultIndex[1] = j;
                }
            }
        }
        return resultIndex;
    }
}
