package com.gabchak;

//1480
public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = new RunningSumOf1dArray_1480().runningSum(nums);
        for (int j : result) {
            System.out.println(j);
        }
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int acc = 0;
        for (int i = 0; i < nums.length; i++) {
            acc += nums[i];
            result[i] = acc;
        }
        return result;
    }
}