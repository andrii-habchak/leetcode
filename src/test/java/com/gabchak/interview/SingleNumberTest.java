package com.gabchak.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SingleNumberTest {

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{4, 1, 2, 1, 2}, 4),
                Arguments.of(new int[]{1}, 1)
                );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void singleNumber(int[] input, int expected) {
        int actual = new SingleNumber().singleNumber(input);
        Assertions.assertEquals(expected, actual);
    }
}