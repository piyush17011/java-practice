package DSA.patterns;

public class p7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {

            //first spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("_");
            }

            //stars

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //second spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
