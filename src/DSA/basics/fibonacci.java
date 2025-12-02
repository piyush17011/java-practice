package DSA.basics;

public class fibonacci {


    public static void main(String[] args) {
        int a =0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=5;

        while(n>2){
            int c = a+b;
            System.out.print(c+" ");
            n--;
            a=b;
            b=c;
        }
        System.out.println();

//        for (int i = 0; i < n-2 ; i++) {
//            int c = a + b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//        }

    }


}
