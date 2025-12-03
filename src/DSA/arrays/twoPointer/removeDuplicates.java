package DSA.arrays.twoPointer;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,22,33,33,55,66,77};

        int unique = 0;       //track the unique index
        int count = 0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]!=arr[unique]){      //as soon as we find different no
                unique++;                     //to not loose track of unique
                arr[unique] =arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count+1);
    }
}
