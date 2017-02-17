package org.gloria.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Create on 2017/2/17 15:48.
 *
 * @author : gloria.
 * 
 * @see : https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length + 1; i++) {

            if (i == nums.length||nums[i] != i) {
                return i;
            }
            
        }
        return Integer.MIN_VALUE;
    }

    @Test
    public void test() {
        int[] nums = new int[]{0,1,2,4};
        System.out.println(missingNumber(nums));
    }
    
}
