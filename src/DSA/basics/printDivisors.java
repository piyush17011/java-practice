package DSA.basics;

public class printDivisors {
    public static void main(String[] args) {

        int n=10;

        for (int i = 1; i <=n ; i++) {
            if(n%i==0) System.out.print(i+" ");
        }

    }
}
