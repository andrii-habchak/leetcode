package com.gabchak.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PlusOneTest {

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3}, new int[] {1,2,4}),
                Arguments.of(new int[] {4,3,2,1}, new int[] {4,3,2,2}),
                Arguments.of(new int[] {9}, new int[] {1,0}),
                Arguments.of(new int[] {9,8,7,6,5,4,3,2,1,0}, new int[] {9,8,7,6,5,4,3,2,1,1}),
                Arguments.of(new int[] {9,9,9}, new int[] {1,0,0,0}),
                Arguments.of(new int[] {9,8,9}, new int[] {9,9,0})
        );
    }

    PlusOne classInstance;

    @BeforeAll
    void setUp() {
        classInstance = new PlusOne();
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void plusOne(int[] input, int[] expected) {
        int[] actual = classInstance.plusOne(input);

        Assertions.assertArrayEquals(expected, actual);
    }
}