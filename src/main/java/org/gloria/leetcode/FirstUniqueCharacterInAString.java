package org.gloria.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Create on 2017/2/6 17:23.
 *
 * @author : gloria.
 * 
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 * @see : https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        
        return -1;
    }
    
    @Test
    public void test() {
        String s = "adaadaad";
        System.out.println(firstUniqChar(s));
    }
}
