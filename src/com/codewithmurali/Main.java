package com.codewithmurali;

import java.util.ArrayList;

interface Mobile {
    public void calling(String number);
    public void sendMessage(String message);


}
abstract class Cell{
    ArrayList<String > list = new ArrayList<>();
    abstract  void  calling(String number);
    abstract void sendMessage(String message);
    public void addContact(String number){
        list.add(number);
    }
}
class Samsung extends Cell{

    @Override
    void calling(String number) {
        System.out.println("samsung cell calling"+number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("sam sending "+message);

    }
}
class Apple implements  Mobile{

    private ArrayList<String> contacts = new ArrayList<>();
    public void addContacts(String number){
        contacts.add(number);
    }
    @Override
    public void calling(String number) {
        System.out.println("calling"+number);

    }

    @Override
    public void sendMessage(String message) {
        System.out.println("message ssnt is"+message);

    }
}
public class Main{
    public static void main(String[] args){
        Apple a = new Apple();
        a.calling("9876543210");
        a.sendMessage("89545 hwu bro");
        a.addContacts("9876542310");
        Samsung s = new Samsung();
        s.addContact("98775631");
        s.calling("987456123");
        s.sendMessage("hwu doing?");
    }
}
