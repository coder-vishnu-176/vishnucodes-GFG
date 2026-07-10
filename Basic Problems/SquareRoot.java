/*
Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number.
*/

class Solution {
    int floorSqrt(int n) {
        int number = n;
        
        for(int i=1;i<=n;i++){
            int square = i*i;
            if(square == number){
                return i;
            }
            else if(i*i >= number){
                return i-1;
            }
        }
        return 0;
    }
}
