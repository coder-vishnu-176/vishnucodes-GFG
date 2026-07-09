/*
Given a number n, print your answer according to the following conditions:

If the number is divisible by 3, you print Fizz
If the number is divisible by 5, you print Buzz
If the number is divisible by both 3 and 5, you print FizzBuzz
In any other case, you print the number itself
*/

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }
        else if(n%3==0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(n);
        }
    }
}
