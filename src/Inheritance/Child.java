package Inheritance;

public class Child extends Parent {
    @Override
    void say() {
        System.out.println("im the child");
    }
    Child(){
        System.out.println("Child constructor called");
    }
}
