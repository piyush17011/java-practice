package DSA.patterns;

public class p16 {
    public static void main(String[] args) {

        int n=5;

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A'+i; ch++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
