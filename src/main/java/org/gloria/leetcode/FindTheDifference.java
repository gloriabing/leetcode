package org.gloria.leetcode;

import org.junit.Test;

/**
 * Create on 2017/1/13 11:24.
 *
 * @author : gloria.
 * 
 * @see : https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        char target = 0;
        int size = 125;
        int[] arrayS = new int[size];
        int[] arrayT = new int[size];
        for (int i = 96; i < size; i++) {
            arrayS[i] = 0;
            arrayT[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            arrayS[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            arrayT[t.charAt(i)]++;
        }

        for (int i = 96; i < size; i++) {
            if (arrayS[i] != arrayT[i]) {
                target = (char) i;
                break;
            }
        }
        
        return target;
    }

    
    @Test
    public void test() {
        String s = "abcd";
        String t = "abcde";
//        System.out.println((int)'z');
        System.out.println(findTheDifference(s, t));
    }
    
}
