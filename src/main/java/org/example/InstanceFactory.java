package org.example;

public class InstanceFactory {
    public person create(){
        person person = new person();
        person.setName("xxxx");
        person.setAge(12144343);
        return person;
    }
}
