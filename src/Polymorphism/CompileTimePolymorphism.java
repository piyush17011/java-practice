package Polymorphism;

// achieved using method overloading
class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }

}

public class CompileTimePolymorphism {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2,3,4));
        System.out.println(calc.add(2.2,3.3));
    }


}
