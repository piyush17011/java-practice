package DSA.basics;

public class evenOdd {

    public static void main(String[] args) {

        int n=12;
//        if(n%2==0) System.out.println("Even");
//        else System.out.println("Odd");

        for (int i = 1; i <=n ; i++) {
            if(i%2==0) System.out.println(i+ " Even");
            else System.out.println(i+ " Odd");
        }
    }
}
