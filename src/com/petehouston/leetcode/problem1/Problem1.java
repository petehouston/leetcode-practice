package com.petehouston.leetcode.problem1;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public int[] twoSum_bruteforce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum_map(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[] { map.get(j), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
        Problem1 p = new Problem1();
        test(p.twoSum_bruteforce(new int[] {2, 7, 11, 15}, 9), new int[] {0, 1});
        test(p.twoSum_map(new int[] {2, 7, 11, 15}, 9), new int[] {0, 1});
    }

    public static void test(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            System.out.println("FAILED");
        } else {
            for (int i = 0; i < expected.length; i++) {
                if (expected[i] != actual[i]) {
                    System.out.println("FAILED");
                    return;
                }
            }
            System.out.println("PASSED");
        }
    }
}
