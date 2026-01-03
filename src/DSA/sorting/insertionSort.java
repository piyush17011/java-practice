package DSA.sorting;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {91,22,31,122,221};

        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int j = i;

            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
        for(int num :arr){
            System.out.print(num + " ");
        }
    }
}
