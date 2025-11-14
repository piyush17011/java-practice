package Polymorphism.RuntimePolymorphism;

import java.sql.SQLOutput;

public class Dog extends Animal{
    @Override
    void sayHello() {
        System.out.println("Woof");
    }
    void sayBye(){
        System.out.println("Woof woof");
    }
}
