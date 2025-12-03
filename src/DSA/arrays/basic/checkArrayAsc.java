package DSA.arrays.basic;

public class checkArrayAsc {
    public static void main(String[] args) {
        boolean asc = true;
        int[] arr ={1,13,4,7,9};
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]>arr[i-1]){}
//            else asc=false;
//        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                asc=false;
                break;
            }
        }
        System.out.println(asc);
    }
}
