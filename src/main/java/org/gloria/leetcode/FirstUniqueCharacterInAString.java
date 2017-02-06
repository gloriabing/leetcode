package org.gloria.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Create on 2017/2/6 17:23.
 *
 * @author : gloria.
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
