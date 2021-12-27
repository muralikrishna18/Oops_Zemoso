package com.codewithmurali;
class Addition{
    public void sum(int a, int b){
        System.out.println("sum is: "+(a+b));
    }
    public int sum(double a, double b){
        System.out.println("sum is: "+(a+b));
        return 0;
    }
}
public class OverLoadingDemo {
    public static void main(String[] args) {
        Addition add =new Addition();
        add.sum(5,6);
        add.sum(1,1.1);

    }
}
