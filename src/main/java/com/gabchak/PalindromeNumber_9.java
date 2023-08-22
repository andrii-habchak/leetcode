package com.gabchak;

//9
public class PalindromeNumber_9 {

    public boolean isPalindrome(int x) {
        String inputValueAsString = String.valueOf(x);
        String reversedValue = new StringBuilder(inputValueAsString).reverse().toString();
        return inputValueAsString.equals(reversedValue);
    }

    public boolean isPalindromeFast(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return (x == reversed) || (x == reversed / 10);
    }
}
