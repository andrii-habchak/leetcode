package com.gabchak.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RemoveDuplicatesFromSortedArrayTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void removeDuplicates(int[] args, int expectedUniqueCounter, int[] expectedSortedArray) {
        int actualUniqueCounter = new RemoveDuplicatesFromSortedArray().removeDuplicates(args);
        int[] sortedArray = new int[expectedUniqueCounter];
        System.arraycopy(args, 0, sortedArray, 0, expectedUniqueCounter);
        Assertions.assertEquals(expectedUniqueCounter, actualUniqueCounter);
        Assertions.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[] {1,1,2}, 2, new int[] {1,2}),
                Arguments.of(new int[] {0,0,1,1,1,2,2,3,3,4}, 5, new int[] {0,1,2,3,4}),
                Arguments.of(new int[] {1,1}, 1, new int[] {1})
        );
    }
}