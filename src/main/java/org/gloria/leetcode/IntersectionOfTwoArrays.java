package org.gloria.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Create on 2017/2/3 10:19.
 *
 * @author : gloria.
 * 
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * @see : https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (find(nums1, nums2[i])) {
                set.add(nums2[i]);
            }
        }

        int[] resultArray = new int[set.size()];
        int cursor = 0;
        for (Integer integer : set) {
            resultArray[cursor++] = integer;
        }
        return resultArray;
    }
    
    public boolean find(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == key) {
                return true;
            }
            if (nums[mid] > key) {
                high = mid - 1;
            }
            if (nums[mid] < key) {
                low = mid + 1;
            }
        }
        
        return false;
    }
    
    @Test
    public void test() {
        int[] nums1 = new int[]{1, 2, 4, 3, 2, 1};
        int[] nums2 = new int[]{2, 3};
        int[] result = intersection(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
