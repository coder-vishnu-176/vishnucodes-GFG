/*Reverse an array using a new array*/

import java.util.Arrays;

class Main {
    public static int[] revArray(){
        int[] arr = {5,4,3,2,1};
        int[] rev = new int[arr.length];
        int j=0;
        for(int i=arr.length-1 ; i>=0; i--){
            rev[j] = arr[i];
            j++;
        }
        return rev;
    }
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(revArray()));
        }
        
    }
