package com.codewithmurali;
class Account{
    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class EncapsulationDemo {
    public static void main(String args[]){
        Account acc = new Account();
        acc.setBalance(50000);
        System.out.println(acc.getBalance());

    }

}
