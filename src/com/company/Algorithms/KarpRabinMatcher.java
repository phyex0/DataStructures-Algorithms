package com.company.Algorithms;

import java.util.HashMap;

/*
 *   This algorithm is better approach of string matcher.
 *
 *   O(n) where n is the length of the text
 *   O(m * (v+ n / q)) where v is number of valid shifts
 *   O(n) + O(m * (v+ n / q)) if q >= m, it equals to O(n)

 *
 */
public class KarpRabinMatcher {

    public static boolean match(String pattern, String text) {
        if (pattern.length() > text.length())
            return false;

        //doing case insensitive
        pattern = pattern.toUpperCase();
        text = text.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();
        mapLoader(map);

        long hashPattern = 0, hashText = 0;
        //hashing the pattern and text
        for (int i = 0; i < pattern.length(); i++) {
            hashPattern += Math.pow(26, pattern.length() - i - 1) * map.get(pattern.charAt(i));
            hashText += Math.pow(26, pattern.length() - i - 1) * map.get(text.charAt(i));
        }

        for (int i = pattern.length(); i < text.length(); i++) {
            if (hashPattern == hashText)
                return true;

            //rolling hash
            hashText -= Math.pow(26, pattern.length() - 1) * map.get(text.charAt(i - pattern.length()));
            hashText *= 26;
            hashText += map.get(text.charAt(i));
        }

        //if the pattern exists at the beginning or end of the text we're confirming it.
        return hashPattern == hashText ? true : false;

    }

    private static void mapLoader(HashMap<Character, Integer> map) {
        int i = 1;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : alphabet.toCharArray())
            map.put(c, i++);
    }
}
