package com.gabchak.interview;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int indexToPaste = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int nextIndex = i + 1;
            int next = nums[nextIndex];
            if (current != next) {
                if (indexToPaste != nextIndex) {
                    nums[indexToPaste] = next;
                }
                indexToPaste++;
            }
        }
        return indexToPaste;
    }
}
