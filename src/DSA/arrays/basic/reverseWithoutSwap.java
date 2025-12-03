package DSA.arrays.basic;

import java.util.Arrays;

public class reverseWithoutSwap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans[] = new int[arr.length];
//        System.out.println(arr.length);
//        System.out.println(ans.length);
        for (int i = 0; i < arr.length ; i++) {
            ans[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
