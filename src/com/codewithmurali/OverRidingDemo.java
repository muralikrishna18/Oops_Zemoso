package com.codewithmurali;
class Vehicle {
    public void run(){
        System.out.println("Vehicle is running");

    }
}
class Car extends Vehicle {
    @Override
    public void run(){
        System.out.println("Car is running");
    }

}
public class OverRidingDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        Vehicle c1=(Vehicle)car;//down casting
        car.run();
        Vehicle v = new Car();//up casting casting;
        v.run();


    }
}
