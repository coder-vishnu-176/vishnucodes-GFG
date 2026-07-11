/*
Given two strings denoting non-negative numbers s1 and s2. Calculate the sum of s1 and s2.
*/


import java.math.BigInteger;

class Solution {
    String findSum(String s1, String s2) {
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        BigInteger num = num1.add(num2);
        String result = String.valueOf(num);
        return result;
    }
}
