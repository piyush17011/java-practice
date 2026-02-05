package ThreadsBasics;

class A extends Thread{
    public void run(){
        for (int i = 1; i < 100; i++) {
            System.out.println("Piyush ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 1; i < 100; i++) {
            System.out.println("Tanmay ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Basicthreads{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
