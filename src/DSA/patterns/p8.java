package DSA.patterns;

public class p8 {
    public static void main(String[] args) {

        int n=5;
        for (int i = 0; i < n; i++) {

            //spaces
            for(int j=0;j<i;j++){
                System.out.print("_");
            }
            //stars
            for(int j=0;j< 2*n-(2*i+1);j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
