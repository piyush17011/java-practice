package Encapsulation;

import java.net.StandardSocketOptions;

public class Bank {

    private int bankAccountNo;
    private int balance;

    public void withdraw(int amt){
        if(balance<=0 && amt>balance){
            System.out.println("Nah");
        }
        else{
            System.out.println(amt + " Rs. Withdrawed");
            balance = balance - amt;
        }
    }

    public void deposit(int amt){
        if(amt <0){
            System.out.println("amt shouldnt be less than 0");
        }
        else{
            balance += amt;
            System.out.println(amt + " Rs. Deposited" + "Current balance "+ balance);
        }

    }

    public void setBankAccountNo(int acc){
        if(acc < 0){
            System.out.println("Acc no invalid");
        }
        this.bankAccountNo = acc;
    }

    public int getBankAccountNo(){
        return this.bankAccountNo;
    }

    public void setBankBalance(int amt){
        if(amt < 0){
            System.out.println("Amount is invalid");
        }
        this.balance = amt;
    }
    public int getBankBalance(){
        return this.balance;
    }

}
