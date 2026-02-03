package ExceptionHandling;

public class trythrow {
    public static void main(String[] args) {

        int num = 170;
        int den = 10;

        try{
            if(den==0) throw new ArithmeticException("ts error was thrown");
            int div = num/den;
            System.out.println(div);

            //manually throwing an exception

        }
        catch(ArithmeticException e){
            System.out.println("This is an Arithmetic Exception ");
        }
        catch(Exception err){
            System.out.println("All Exceptions are handled are here "+ err);
        }
        finally {
            System.out.println("GGs man");
        }
        System.out.println("End ");

    }
}
