package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Bank acc = new Bank();
        System.out.println(acc.getBankBalance());
        acc.deposit(100);
        acc.withdraw(9);
        System.out.println(acc.getBankBalance());
    }
}
