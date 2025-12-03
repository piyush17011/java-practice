package DSA.recursion;

public class printSum {
//    static int sum=0;
//    static void printSum(int n){
//        if(n==0){
//            System.out.println(sum);
//            return;
//        }
//        sum = sum + n;
//        printSum(n-1);
//    }
    static int printSum(int n){
        if(n==0) return 0;
        return n+printSum(n-1);
    }

    public static void main(String[] args) {
//        printSum(5);
        System.out.println(printSum(5));
    }

}
