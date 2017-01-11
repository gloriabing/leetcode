package org.gloria.leetcode;

import org.junit.Test;

/**
 * Create on 2016/12/29 17:27.
 *
 * @author : gloria.
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        int pre = toNumber(s.charAt(0));
        int result = pre;
        for (int i = 1; i < s.length(); i++) {
            int current = toNumber(s.charAt(i));
            if (current > pre) {
                result = result - pre + (current - pre);
            } else {
                result += current;
            }
            pre = current;
        }
        return result;
    }


    public int toNumber(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    
    @Test
    public void test() {
        String str = "XCIX";
        System.out.println(romanToInt(str));
        
    }
}
