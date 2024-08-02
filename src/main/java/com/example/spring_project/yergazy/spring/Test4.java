package com.example.spring_project.yergazy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myPet", Dog.class);
//        dog.setName("ScoobyDoo");

        Dog dog2 = context.getBean("myPet", Dog.class);
//        dog2.setName("Buldog");

//        System.out.println(dog.getName());
//        System.out.println(dog2.getName());

        System.out.println("Compare - " + (dog==dog2));

        System.out.println(dog);
        System.out.println(dog2);

        context.close();
    }
}
