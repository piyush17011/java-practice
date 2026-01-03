package DSA.searching;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {121,23,33,12,34,};
        int target = 121;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                found = true;
                System.out.println(target + " Found at position " +i);
            }
        }
        if(!found){
            System.out.println(target +" Not Found");
        }
    }
}
