/*You are given an array of integers arr[]. You have to reverse the given array.

Note: Modify the array in place.*/

class Solution{
    public static int[] reverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
