package com.codewithmurali;
class BankAccount{
    private double balance = 10_000_000;
    private String username = "basicsstrong";
    private String password = "password";

    public double getBalance(String username,String password) {
        if(this.username.equals(username)&&this.password.equals(password))
            return balance;
        else return 0.0;
    }
}
public class DataHidingDemo {
    public static void main(String args[]){
        BankAccount n = new BankAccount();
        double bal = n.getBalance("basicsstrong","password");
        System.out.println(bal);

    }
}
