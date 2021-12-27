package com.codewithmurali;

import java.util.ArrayList;
import java.util.List;

class College{
    String name;
    private List<Teacher> teacher;

    public College(String name,List<Teacher> teacher) {
        this.teacher = teacher;
        this.name = name;
    }
    public List<Teacher> getTeachers(){
        return teacher;
    }
}
class Teacher{
    String name;
    String subject;
    public Teacher(String name,String sub){
        this.name = name;
        this.subject = sub;
    }
    @Override
    public String toString(){
        return "[Teacher :" +name+", Subject :"+subject +"]";
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Rohan","java"));
        //teachers.add(new Teacher("John","pythn"));
        System.out.println(new Teacher("Rohan","java"));
        College college = new College("MyCollege",teachers);
    }
}
