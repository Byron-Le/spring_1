package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        // create spring container
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get object from container
        Object person = app.getBean("person");
        System.out.println(person);

        Object person2 = app.getBean("person2");
        System.out.println(person2);
        Object person3 = app.getBean("person3");
        System.out.println(person3);
        //使用简单工厂，抽象工厂创建

        Object person4 = app.getBean("person4");
        System.out.println(person4);
    }
}
