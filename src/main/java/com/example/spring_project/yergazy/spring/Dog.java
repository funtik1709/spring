package com.example.spring_project.yergazy.spring;

public class Dog implements Pet {

    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    //модификаторы доступа могут быть любые
    // методы должны быть без параметров
    public void init() {
        System.out.println("Class Dog: init method");
    }

    //модификаторы доступа могут быть любые
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

}
