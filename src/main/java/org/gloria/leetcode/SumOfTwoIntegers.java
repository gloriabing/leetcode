package org.gloria.leetcode;

import org.junit.Test;

/**
 * Create on 2017/1/12 16:51.
 *
 * @author : gloria.
 * 
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 * 
 */
public class SumOfTwoIntegers {
    
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
    
    @Test
    public void test() {
        int a = 1, b = 7;
        System.out.println(getSum(a, b));
    }
}
