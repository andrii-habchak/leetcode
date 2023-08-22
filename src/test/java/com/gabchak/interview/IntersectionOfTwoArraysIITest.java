package com.gabchak.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class IntersectionOfTwoArraysIITest {

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,2,2,1}, new int[] {2,2}, new int[] {2,2}),
                Arguments.of(new int[] {4,9,5}, new int[] {9,4,9,8,4}, new int[] {9,4}),
                Arguments.of(new int[] {1,2,3,4,5,6}, new int[] {4,5,6,7,8,9}, new int[] {4,5,6}),
                Arguments.of(new int[] {1,2,3,4,4,5,6}, new int[] {4,4,5,6,7,8,9,4,5,6}, new int[] {4,4,5,6})
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void intersect(int[] nums1, int[] nums2, int[] expected) {
        int[] actual = new IntersectionOfTwoArraysII().intersect(nums1, nums2);

        Assertions.assertArrayEquals(expected, actual);
    }
}