package DSA.basics;

public class prime {
    public static void main(String[] args) {
        int n=117;
        boolean isPrime = true;

        for (int i = 2; i <= n/2 ; i++) {
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime == true) System.out.println("Prime");
        else System.out.println("Not a Prime");
    }
}
