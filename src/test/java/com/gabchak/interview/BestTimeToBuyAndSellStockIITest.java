package com.gabchak.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BestTimeToBuyAndSellStockIITest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void maxProfit(int[] prices, int expected) {
        int actual = new BestTimeToBuyAndSellStockII().maxProfit(prices);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2}, 1)
        );
    }
}