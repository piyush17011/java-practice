package DSA.sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]= {121,23,33,12,34,1};

        //selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        for(int num :arr){
            System.out.print(num+" ");
        }
    }

}