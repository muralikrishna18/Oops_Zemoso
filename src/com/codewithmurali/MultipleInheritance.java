package com.codewithmurali;
interface AA{
    default void method(){
        System.out.println("Method of AA");
    }

}
interface AAA{
    default void method(){
        System.out.println("Method of AAA");
    }

}
class F implements AA , AAA{

    @Override
    public void method() {
        AA.super.method();
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        (new F()).method();
    }
}
