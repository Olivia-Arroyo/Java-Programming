package recursion;

import java.util.Arrays;

public class Recursion {
    public static String Reverse(String s){
        // Base Case:
        if((s == null) || (s.length() <= 1)) {
            return s;
        }//Recursive Case: Keep going
        else {
            return Reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static int[] Rearrange(int[] arr, int n){
        //Base Case:
        if(n == 1) {
            return arr;
        } // Recursive case
        else {
            for (int i =0; i<n-1; i++){
                if(arr[i] %2 !=0) {
                    int temp = arr[1];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            return Rearrange(arr, n-1);
        }
    }
    public static void main(String[] args) {
        String s = "pots&pans";
        System.out.println("The reverse of " + s + " is " + Reverse(s));

        int[] arr = {10, 20, 45, 16, 32, 3, 7, 16, 39};
        System.out.println(Arrays.toString(Rearrange(arr, arr.length)));
    }
}