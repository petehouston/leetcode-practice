package com.petehouston.leetcode.problem20;

import java.util.Stack;

public class Problem20 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        char[] data = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char c: data) {
            if (c == '{' || c == '[' || c == '(') stack.push(c);
            else {
                char last = stack.empty() ? '-' : stack.pop();

                if ((c == '}' && last != '{')
                        || (c == ']' && last != '[')
                        || (c ==')' && last != '(')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Problem20 p = new Problem20();
        System.out.println(p.isValid("()[]{}"));
        System.out.println(!p.isValid("([)]"));
    }
}
