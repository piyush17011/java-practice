package DSA.patterns;

public class p5 {
    public static void main(String[] args) {

        int n=3;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
