package com.gabchak;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz_412 {

    //stream solution runtime 3 times longer
    public List<String> fizzBuzzStream(int n) {
        return Stream.iterate(1, i -> i + 1)
                .limit(n)
                .map(this::replace)
                .collect(Collectors.toList());
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            result.add(replace(i));
        }
        return result;
    }

    private String replace(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
