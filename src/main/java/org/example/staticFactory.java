package org.example;

public class staticFactory {
    public static person staticFactory(String name, int age){
        person person = new person();
        person.setName(name);
        person.setAge(age);
        return person;
    }
}
