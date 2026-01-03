package DSA.sorting;

public class quickSort {
    public static void main(String[] args) {
        //quicksort
        int arr[] = {21,2,12,34,81,31,19};
        quick(0,arr.length-1,arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    static void quick(int low,int high,int arr[]){
        if(low<high){
            int part = partition(low,high,arr);
            quick(low,part,arr);
            quick(part+1,high,arr);
        }
    }

    static int partition(int low,int high,int arr[]){
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;

        while(true){
            do{ i++; } while(arr[i]<pivot);
            do{ j--; } while(arr[j]>pivot);

            if(i>=j) return j;

            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

    }
}
