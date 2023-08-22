package com.gabchak.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RotateArrayTest {

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,4,5,6,7}, 3, new int[] {5,6,7,1,2,3,4}),
                Arguments.of(new int[] {1,2,3,4,5,6,7}, 7, new int[] {1,2,3,4,5,6,7}),
                Arguments.of(new int[] {-1,-100,3,99}, 2, new int[] {3,99,-1,-100})
        );
    }


    @ParameterizedTest
    @MethodSource("provideTestData")
    void rotate(int[] input, int k, int[] expected) {
        new RotateArray().rotate(input, k);

        Assertions.assertArrayEquals(expected, input);
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void rotate2(int[] input, int k, int[] expected) {
        new RotateArray().rotate2(input, k);

        Assertions.assertArrayEquals(expected, input);
    }
}