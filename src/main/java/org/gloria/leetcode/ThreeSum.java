package org.gloria.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create on 2017/3/3 11:26.
 *
 * @author : gloria.
 * 
 * @see : https://leetcode.com/problems/3sum/?tab=Description
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> resultList = new ArrayList<>();

        for (int first = 0; first < nums.length - 2; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int second = first + 1;
            int third = nums.length - 1;
            while (second < third) {
                if (nums[second] + nums[third] == -nums[first]) {
                    resultList.add(Arrays.asList(nums[first], nums[second], nums[third]));
                    second++;
                    third--;

                    while (second < third && nums[second] == nums[second - 1]) {
                        second ++;
                    }

                    while (second < third && nums[third] == nums[third + 1]) {
                        third--;
                                
                    }
                } else if (nums[second] + nums[third] > -nums[first]) {
                    third--;
                } else {
                    second++;
                }
            }
        }

        return resultList;
    }
    
    @Test
    public void test() {
        int[] nums = new int[]{2,13,-2,-5,-1,10,6,-8,5,-5,7,-5,-14,-4,-5,10,-15,-2,-14,-6,10,6,-14,-14,-9,-11,8,-3,-2,12,-9,-14,3,5,-12,-13,-8,1,-14,12,12,0,14,5,4,-14,-8,4,-9,-7,14,-13,6,7,-12,5,12,11,-13,-5,0,-6,-12,-12,6,13,12,13,0,5,2,-11,13,1,9,2,2,-14,13,8,-14,4,2,8,-3,-3,-10,-14,-15,14,-12,1,-15,14,-4,6,12,-6,-4,-3,6,5};
        List<List<Integer>> list = threeSum(nums);
        for (List<Integer> integers : list) {
            integers.forEach(i -> System.out.print(i + ","));
            System.out.println();
        }
    }
    
}
