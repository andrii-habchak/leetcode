package com.gabchak;

//1 https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        int[] resultIndex = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultIndex[0] = i;
                    resultIndex[1] = j;
                    return resultIndex;
                }
            }
        }
        throw new IllegalArgumentException("wrong arguments");
    }

    public int[] twoSumUseHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                Integer index = map.get(difference);
                if (index != i) {
                    return new int[] {i, index};
                }
            }
        }
        throw new IllegalArgumentException("wrong arguments");
    }


}
