package DSA.patterns;

public class p17 {
    public static void main(String[] args) {
        int n=5;

        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print("_");
            }

            //chars
            char ch='A';
            int breakpoint = (2*i+1) / 2;
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print(ch);
                if(j < breakpoint) ch++;
                else ch--;
            }



            System.out.println();
        }

    }
}
