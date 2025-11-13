package ClassessAndObjects;

public class PrivateClass {
    public static void main(String[] args) {
        Bank hdfc = new Bank();
        hdfc.setBalance(90000);
        System.out.println(hdfc.getBalance());


    }
}

class Bank{
    private int balance= 60000;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}