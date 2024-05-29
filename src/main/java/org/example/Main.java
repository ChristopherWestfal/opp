package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A8", "Blau", 2024, 210);
        Car car2 = new Car("Volvo", "C30", "Gelb", 2012, 190);
        Person p1 = new Person("Hans", 21, "m");
        Person p2 = new Person("Lischen", 35, "w");

        car1.starts();

        car2.accelerates();
        car2.printSpeed();

        p1.introduction();
        p2.introduction();
    }
}