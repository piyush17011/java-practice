package Inheritance;

public class Parent extends Grandfather {
    String name;
    int age;

    void say(){
        System.out.println("hii im the parent");
    }
    Parent(){
        System.out.println("Parent constructor called");
    }
}
