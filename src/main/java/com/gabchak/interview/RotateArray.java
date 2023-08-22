package com.gabchak.interview;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {
    //replace the array elements in the cycle
    // doesn't work well with huge amount of data
    public void rotateByReplacingArrayElementsInCycle(int[] nums, int k) {
        int rotateCycles = k % nums.length;
        for (int i = 0; i < rotateCycles; i++) {
            moveToTheRight(nums);
        }
    }

    private static void moveToTheRight(int[] nums) {
        int theLastElement = nums[nums.length - 1];
        for (int j = nums.length - 1; j > 0; j--) {
            nums[j] = nums[j - 1];
        }
        nums[0] = theLastElement;
    }

    // create a new array 'k' size.
    // move the input array to 'k' elements to the right.
    // copy the array to the start of input array.
    public void rotate(int[] nums, int k) {
        int rotateCycles = k % nums.length;
        if (rotateCycles > 0) {
            int[] before = new int[rotateCycles];
            int movedElementsNumber = nums.length - rotateCycles;
            System.arraycopy(nums, movedElementsNumber, before, 0, rotateCycles);
            System.arraycopy(nums, 0, nums, rotateCycles, movedElementsNumber);
            System.arraycopy(before, 0, nums, 0, before.length);
        }
    }

    public void rotate2(int[] nums, int k) {
        int rotateCycles = k % nums.length;
        if (rotateCycles > 0) {
            int movedElementsNumber = nums.length - rotateCycles;
            // Arrays.copyOfRange makes swallow copy of objects but good for primitives
            int[] before = Arrays.copyOfRange(nums, movedElementsNumber, nums.length);
            System.arraycopy(nums, movedElementsNumber, before, 0, rotateCycles);
            System.arraycopy(nums, 0, nums, rotateCycles, movedElementsNumber);
            System.arraycopy(before, 0, nums, 0, before.length);
        }
    }
}
