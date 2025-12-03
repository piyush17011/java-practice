package DSA.recursion;

public class printNameNTime {

    String name = "Piyush";
    void print(int n){
        //base
        if(n==0) return;
        System.out.println(name);
        print(n-1);
    }
    public static void main(String[] args) {
        printNameNTime obj = new printNameNTime();
        obj.print(3);
    }
}
