/*
Given a non-negative integer n, return true if it is a power of 2. Otherwise, return false.  

Examples

Input: n = 8
Output: true
Explanation: 8 is equal to 2 raised to 3 (2^3 = 8).
*/

class Solution {
    public static boolean isPowerofTwo(int n) {
        for(int i=0; i<=n; i++){
            int powerofTwo = (int) Math.pow(2,i);
            
            if(powerofTwo == n){
                return true;
            }
        }
        return false;
    }
}
