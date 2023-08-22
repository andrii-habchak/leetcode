package com.gabchak.interview;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for (Integer num : nums) {
            if (!unique.add(num)) {
                return true;
            }
        }
        return false;
    }
}
