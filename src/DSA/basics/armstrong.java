package DSA.basics;

public class armstrong {
    public static void main(String[] args) {

        int n =371;
        int temp = n;
        int armstrong=0;
        int count=0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = n;
        while(temp>0){
            int last = temp%10;
            armstrong = armstrong + (int) Math.pow(last,count);
            temp = temp/10;
        }

        if(armstrong==n) System.out.println("Armstrong");
        else System.out.println("Not an armstrong");
    }
}
