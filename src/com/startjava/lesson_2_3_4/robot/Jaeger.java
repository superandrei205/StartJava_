package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String name;
    private String status;
    private int mark;
    private double height;
    private double weight;

    public Jaeger() {}

    public Jaeger(String name, String status, int mark, double height, double weight) {
        this.name = name;
        this.status = status;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void launch() {
        System.out.println(name + " запущен в бой!");
    }
}