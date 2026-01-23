package com.startjava.lesson_2_3.person;

public class Person {
    private String name = "Алексей";
    private char gender = 'M';
    private int age = 25;
    private double height = 178.5;
    private double weight = 72.3;

    public void walk() {
        System.out.println(name + " идёт.");
    }

    public void sit() {
        System.out.println(name + " сидит.");
    }

    public void run() {
        System.out.println(name + " бежит.");
    }

    public void speak() {
        System.out.println(name + " говорит.");
    }

    public void learnJava() {
        System.out.println(name + " учит Java.");
    }
}
