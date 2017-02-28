package org.gloria.leetcode;

import org.junit.Test;

/**
 * Create on 2017/2/28 14:10.
 *
 * @author : gloria.
 * 
 * @see : https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {
    
    public boolean isHappy(int n) {
        while (n > 6) {
            
            int result = 0;
            while (n != 0) {
                result += (n % 10) * (n % 10);
                n /= 10;
            }
            n = result;

        }

        return n == 1;
    }

    @Test
    public void test() {
        int n = 2;
        System.out.println(isHappy(n));
    }
    
}
