package DSA.basics;

public class count {
    public static void main(String[] args) {

        int n=10010;

        int count=0;
        while(n>0){
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}
