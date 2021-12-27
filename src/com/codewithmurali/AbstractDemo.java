package com.codewithmurali;

abstract class Department {
    public abstract int getEmp();
    public abstract void method();
}
class DeptOne extends Department{

    @Override
    public int getEmp() {
        return 100;
    }

    @Override
    public void method() {
        System.out.println("this is implementation");

    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        DeptOne dept = new DeptOne();
        System.out.println(dept.getEmp());

    }

}
