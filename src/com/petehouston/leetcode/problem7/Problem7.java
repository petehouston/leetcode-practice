package com.petehouston.leetcode.problem7;

public class Problem7 {
    public int reverse(int x) {

        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }

        return (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) ? 0 : (int) n;
    }

    public static void main(String[] args) {
        Problem7 p = new Problem7();
        test(p.reverse(123), 321);
        test(p.reverse(-123), -321);
        test(p.reverse(120), 21);
    }

    public static void test(int expected, int actual) {
        if (expected != actual) {
            System.out.println("FAILED");
        } else {
            System.out.println("PASSED");
        }
    }
}
