package com.petehouston.leetcode.problem13;

public class Problem13 {
    public int romanToInt(String s) {
        if (s.length() < 1) return 0;
        char[] data = s.toCharArray()

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                total += 1;
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') total -= 2;
                }
            }
            else if (c == 'V') total += 5;
            else if (c == 'X') {
                total += 10;
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') total -= 20;
                }
            }
            else if (c == 'L') total += 50;
            else if (c == 'C') {
                total += 100;
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') total -= 200;
                }
            }
            else if (c == 'D') total += 500;
            else if (c == 'M') total += 1000;
        }

        return total;
    }

    /**
     * Improvement:
     *      s.length() : is costly
     *      s.charAt() : is also costly
     *
     *  Instead, breakdown string into char array and deal with array.
     */
    public int romanToInt_improved(String s) {
        if (s.length() < 1) return 0;
        char[] data = s.toCharArray();

        int total = 0;
        for (int i = 0; i < data.length; i++) {
            char c = data[i];
            if (c == 'I') {
                total += 1;
                if (i + 1 < data.length) {
                    if (data[i+1] == 'V' || data[i+1] == 'X') total -= 2;
                }
            }
            else if (c == 'V') total += 5;
            else if (c == 'X') {
                total += 10;
                if (i + 1 < data.length) {
                    if (data[i+1] == 'L' || data[i+1] == 'C') total -= 20;
                }
            }
            else if (c == 'L') total += 50;
            else if (c == 'C') {
                total += 100;
                if (i + 1 < data.length) {
                    if (data[i+1] == 'D' || data[i+1] == 'M') total -= 200;
                }
            }
            else if (c == 'D') total += 500;
            else if (c == 'M') total += 1000;
        }

        return total;
    }

    public static void main(String[] args) {
        Problem13 p = new Problem13();

        System.out.println(p.romanToInt("MCMXCIV") == 1994);
        System.out.println(p.romanToInt("LVIII") == 58);
        System.out.println(p.romanToInt("IX") == 9);
        System.out.println(p.romanToInt("IV") == 4);
        System.out.println(p.romanToInt("III") == 3);
    }
}
