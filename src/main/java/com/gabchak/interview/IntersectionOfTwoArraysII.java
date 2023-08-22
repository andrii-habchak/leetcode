package com.gabchak.interview;

import java.util.*;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Map<Integer, Integer> numbersUsage = buildNumbersUsageMap(nums1);
        List<Integer> result = getIntersection(nums2, numbersUsage);
        return toIntArray(result);
    }

    private static List<Integer> getIntersection(int[] nums2, Map<Integer, Integer> numbersUsage) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            Integer usage = numbersUsage.getOrDefault(num, 0);
            if (usage > 0) {
                result.add(num);
                numbersUsage.put(num, --usage);
            }
        }
        return result;
    }

    private static Map<Integer, Integer> buildNumbersUsageMap(int[] nums1) {
        Map<Integer, Integer> numbersUsage = new HashMap<>();
        for (int num : nums1) {
            Integer value = numbersUsage.getOrDefault(num, 0);
            numbersUsage.put(num, ++value);
        }
        return numbersUsage;
    }

    private static int[] toIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
