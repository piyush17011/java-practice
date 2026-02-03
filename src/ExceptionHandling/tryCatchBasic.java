package ExceptionHandling;

public class tryCatchBasic {
    public static void main(String[] args) {

        int num = 170;
        int den = 10;

        try{
            int div = num/den;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println("This is an Arithmetic Exception ");
        }
        catch(Exception err){
            System.out.println("All Exceptions are handled are here " + err);
        }
        System.out.println("End ");
    }
}
