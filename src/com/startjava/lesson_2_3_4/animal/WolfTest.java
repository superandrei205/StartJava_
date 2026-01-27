package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender('M');
        wolf.setName("Серый");
        wolf.setWeight(42.5);
        wolf.setAge(5);
        wolf.setColor("бурый");

        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Кличка: " + wolf.getName());
        System.out.println("Вес: " + wolf.getWeight() + " кг");
        System.out.println("Возраст: " + wolf.getAge() + " лет");
        System.out.println("Окрас: " + wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}