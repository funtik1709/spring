package com.example.spring_project.yergazy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

//        Dog yourDog = context.getBean("myPet", Dog.class);
//        myDog.say();

        context.close();
    }
}
