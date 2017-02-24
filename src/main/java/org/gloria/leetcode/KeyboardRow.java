package org.gloria.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create on 2017/2/24 17:01.
 *
 * @author : gloria.
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        String[] keyboard = new String[]{firstRow, secondRow, thirdRow};
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int index = 0;
            boolean flag = true;
            if (word.length() == 1) {
                list.add(words[i]);
                continue;
            }
            for (int j = 0; j < word.length(); j++) {
                if (firstRow.contains(String.valueOf(word.charAt(j)))) {
                    index = 0;
                    break;
                }
                if (secondRow.contains(String.valueOf(word.charAt(j)))) {
                    index = 1;
                    break;
                }
                if (thirdRow.contains(String.valueOf(word.charAt(j)))) {
                    index = 2;
                    break;
                }
            }
            for (int j = 1; j < word.length(); j++) {
                if (!keyboard[index].contains(String.valueOf(word.charAt(j)))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(words[i]);
            }
        }
        String[] results = new String[list.size()];
        return list.toArray(results);
    }
    
    @Test
    public void test() {
        String[] words = new String[]{"Aasdfghjkl","Qwertyuiop","zZxcvbnm"};
        String[] results = findWords(words);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
