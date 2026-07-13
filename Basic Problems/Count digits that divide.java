/*
You're given a number.
Look at each digit in that number, one at a time. For every digit, 
check: "does this digit divide the whole original number evenly, with no remainder?" 
Count how many digits pass this test. Skip the digit 0 (since you can't divide by zero).

Hint:
n = 12

Take digit 2: check 12 % 2 == 0? → true → count = 1
Take digit 1: check 12 % 1 == 0? → true → count = 2
*/


class Solution {
    static int evenlyDivides(int n) {
        int count=0;
        int num = n;
        while(n>0){
            int lastDigit  = n%10;
            if(lastDigit!=0 && num%lastDigit == 0){
                count=count+1;
            }
            n = n/10;
        }
        return count;
    }
}
