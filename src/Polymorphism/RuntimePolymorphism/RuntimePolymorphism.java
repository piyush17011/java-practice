package Polymorphism.RuntimePolymorphism;

//achieved by Inheritance/overriding
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();

//        Dog dog = new Dog();
//        dog.sayHello();

        //upcasting
        Animal dog = new Dog();
        dog.sayHello();

        //downcasting
        Dog newdog = (Dog) dog;
        newdog.sayBye();

        Cat cat = new Cat();
        cat.sayHello();
    }
}
