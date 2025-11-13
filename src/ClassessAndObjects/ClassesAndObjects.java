package ClassessAndObjects;

 class Human{
    String health = "good"; //attributes
    String wealth = "bad";  //attributes
    void behave(){
        System.out.println("Humanly behaviour");
    }
}
public class ClassesAndObjects{
    public static void main(String[] args) {
        Human piyush = new Human();
        System.out.println(piyush.health);
        System.out.println(piyush.wealth);
        piyush.behave();

        Bike apache = new Bike();
        System.out.println(apache.model);
    }
}
