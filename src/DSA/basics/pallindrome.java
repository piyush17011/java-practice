package DSA.basics;

public class pallindrome {
    public static void main(String[] args) {
        int n=16461;
        int reverse = 0;
        int temp = n;
        while(n>0){
            int last = n %10;
            reverse = reverse*10+last;
            n = n/10;
        }

        if(reverse == temp) System.out.println("Pallindrome");
        else System.out.println("Not an pallindrome");

    }
}
