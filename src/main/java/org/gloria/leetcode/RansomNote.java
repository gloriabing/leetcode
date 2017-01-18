package org.gloria.leetcode;

import org.junit.Test;

/**
 * Create on 2017/1/18 10:28.
 *
 * @author : gloria.
 * 
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * @see : https://leetcode.com/problems/ransom-note/
 * 
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] flag = new int[128];
        for (char c : magazine.toCharArray()) {
            flag[c]++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (--flag[c] < 0) {
                return false;
            }
        }
        return true;
    }
    
    @Test
    public void test() {
        String ransomNode = "aa";
        String magazine = "a  ab";
        System.out.println(canConstruct(ransomNode, magazine));
    }
}
