package com.gabchak;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        Map<Character, Integer> howManyTimesLetterIsUsed = mapLetterUsage(magazine);

        for (Character noteLetter : ransomNote.toCharArray()) {
            Integer usageTimes = howManyTimesLetterIsUsed.get(noteLetter);
            if (usageTimes == null || usageTimes == 0) {
                return false;
            }
            howManyTimesLetterIsUsed.put(noteLetter, --usageTimes);
        }
        return true;
    }

    private Map<Character, Integer> mapLetterUsage(String magazine) {
        Map<Character, Integer> howManyTimesLetterIsUsed = new HashMap<>();
        for (Character letter : magazine.toCharArray()) {
            Integer usageTimes = howManyTimesLetterIsUsed.getOrDefault(letter, 0);
            howManyTimesLetterIsUsed.put(letter, ++usageTimes);
        }
        return howManyTimesLetterIsUsed;
    }
}
