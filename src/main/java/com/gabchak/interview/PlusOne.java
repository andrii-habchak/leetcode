package com.gabchak.interview;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int temp = 0;
        int[] result = digits;
        for (int i = result.length - 1; i >= 0; i--) {
            int number = result[i];
            int plusOne = i == result.length - 1 ? number + 1 : number + temp;
            if (plusOne < 10) {
                result[i] = plusOne;
                break;
            }
            temp = plusOne % 100 / 10;
            result[i] = plusOne % 10;
            if (i == 0 && temp != 0) {
                int[] test = new int[result.length + 1];
                System.arraycopy(result, 0, test, 1, result.length);
                test[0] = temp;
                result = test;
            }
        }
        return result;
    }
}
