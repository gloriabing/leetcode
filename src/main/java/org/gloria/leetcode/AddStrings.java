package org.gloria.leetcode;

import org.junit.Test;

/**
 * Create on 2017/2/27 15:55.
 *
 * @author : gloria.
 * 
 * @see : https://leetcode.com/problems/add-strings/
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        int i;
        int carry = 0;
        String result = "";
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        StringBuffer buf1 = new StringBuffer(num1).reverse();
        StringBuffer buf2 = new StringBuffer(num2).reverse();
        for (i = 0; i < buf1.length(); i++) {
            int sum = (buf1.charAt(i) - '0') + (buf2.charAt(i) - '0') + carry;

            if (sum > 9) {
                carry = sum / 10;
                result += String.valueOf(sum % 10);
            } else {
                carry = 0;
                result += String.valueOf(sum);
            }
            
        }
        for (int j = i; j < buf2.length(); j++) {
            int sum = buf2.charAt(j) - '0' + carry;
            if (sum > 9) {
                carry = sum / 10;
                result += String.valueOf(sum % 10);
            } else {
                carry = 0;
                result += String.valueOf(sum);
            }
        }
        if (carry != 0) {
            result += String.valueOf(carry);
        }
        
        return new StringBuffer(result).reverse().toString();
    }
    
    @Test
    public void test() {
        String num1 =  "0";
        String num2 = "0";
        System.out.println(addStrings(num1, num2));
        
    }
}
