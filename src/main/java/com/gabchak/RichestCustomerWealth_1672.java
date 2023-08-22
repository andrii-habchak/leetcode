package com.gabchak;

public class RichestCustomerWealth_1672 {

    public int maximumWealth(int[][] accounts) {
        int richestCustomerWealth = 0;
        for (int[] account : accounts) {
            int customerWealth = sum(account);
            richestCustomerWealth = customerWealth > richestCustomerWealth ? customerWealth : richestCustomerWealth;
        }
        return richestCustomerWealth;
    }

    private int sum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }
}
