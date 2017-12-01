package com.javatpoint;

/**
 * Created with IntelliJ IDEA.
 * User: 605137323
 * Date: 02/04/17
 * Time: 08:55
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String name;
    private int id;


    public String getName() {
        return name;
    }
                     Student(int id) {
                         this.id=id;
                     }
    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name +" and "+ id);
    }
}