package com.gabchak.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ContainsDuplicateTest {

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,1}, true),
                Arguments.of(new int[] {1,2,3,4}, false),
                Arguments.of(new int[] {1,1,1,3,3,4,3,2,4,2}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void containsDuplicate(int[] input, boolean expected) {
        boolean actual = new ContainsDuplicate().containsDuplicate(input);
        Assertions.assertEquals(expected, actual);
    }
}