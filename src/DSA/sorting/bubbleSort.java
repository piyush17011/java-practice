package DSA.sorting;

public class bubbleSort{
    public static void main(String[] args) {
        int arr[] ={33,22,233,2,45,66,91,24,65};

        //bubble sort:
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        //print arr
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}