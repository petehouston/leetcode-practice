package com.petehouston.leetcode.problem9;

public class Problem9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = x;
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        return y == n;
    }


    /**
     * Improvement: comparing only half number of digits
     */
    public boolean isPalindrome_better(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        // if number of digit is even: x == rev ; ex: 1221 -> x = 12, rev = 12
        // if number of digit is odd: x = rev / 10 ; ex : 12321 -> x = 12, rev = 123. Since 3 is common digit in middle,
        //      remove it then compare.
        return (x==rev || x==rev/10);
    }

    public static void main(String[] args) {
        Problem9 p = new Problem9();
        System.out.println(p.isPalindrome(121));
        System.out.println(!p.isPalindrome(-121));
        System.out.println(!p.isPalindrome(10));
    }
}
