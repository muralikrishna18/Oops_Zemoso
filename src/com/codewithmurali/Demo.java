package com.codewithmurali;

class Fan{
    private boolean isOn;
    public void turnOn(){
        isOn=true;
        System.out.println("spinning");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("stopped");
    }
}
public class Demo {
    public static void main(String args[]){

        Fan myFan =  new Fan();
        myFan.turnOn();
        myFan.turnOff();

    }

}
