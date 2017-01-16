package org.gloria.leetcode;

import org.junit.Test;


/**
 * Create on 2017/1/16 15:12.
 *
 * @author : gloria.
 * 
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * 
 * @see : https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
            
        }
    }

    public void moveZeroes1(int[] nums) {
        int cursor = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[cursor];
                nums[cursor] = nums[i];
                nums[i] = temp;
                cursor++;
            }
        }
    }
    
    @Test
    public void test() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes1(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }

    }
}
