package DSA.searching;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 5;
        boolean found =false;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                System.out.println("Found at index "+mid);
                found=true;
                break;
            }
            else if(arr[mid]>target) high = mid-1;
            else low=mid+1;
        }
        if(!found) System.out.println("Not Found");
    }
}
