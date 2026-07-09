class Solution{
    public static boolean armstrongNumber(int number){
        int sum=0;
        int num = number;
        while(number>0){
            int n = number % 10; //take the last digit
            int power = (int) Math.pow(n,3);
            sum = sum + power;
            number = number/10;
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
