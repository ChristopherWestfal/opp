package org.example;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private int speed;

    public Car(String brand, String model, String color, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public void starts(){
        System.out.println("Car " + brand +" starts");
    }

    public void accelerates(){
        speed = speed + 5;
        System.out.println("Car " + brand + " accelerates");
    }

    public void printSpeed(){
        System.out.println("Car " + brand + " speed: " + speed);
    }
}
