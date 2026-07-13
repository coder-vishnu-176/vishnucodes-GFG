/*
Given a positive number n. Find the sum of all the digits of n.
*/

class Solution {
    static int sumOfDigits(int n) {
        int sum=0;
        while(n>0){
            int num = n%10;
            sum =sum+num;
            n=n/10;
        }
        return sum;
    }
}
