package com.petehouston.leetcode.problem14;

public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        if (strs.length == 1) return strs[0];

        String first = strs[0];
        char[] feed = first.toCharArray();

        String prefix = "";

        for (int i = 0; i < feed.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1) return prefix;
                if (feed[i] != strs[j].charAt(i)) return prefix;
            }

            prefix += String.valueOf(feed[i]);
        }

        return prefix;
    }

    public static void main(String[] args) {
        Problem14 p = new Problem14();
        System.out.println(p.longestCommonPrefix(new String[] {
                "flower", "flight", "flow"
        }).equals("fl"));

        System.out.println(p.longestCommonPrefix(new String[] {
                "dog","racecar","car"
        }).equals(""));
    }
}
