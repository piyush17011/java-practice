package DSA.arrays.basic;

public class arrayLargest {
    public static void main(String[] args) {

        int arr[] = {11,12,31,14,51};
        System.out.println(arr.length);
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
