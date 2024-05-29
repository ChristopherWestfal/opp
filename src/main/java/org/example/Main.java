package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A8", "Blau", 2024, 210);
        Car car2 = new Car("Volvo", "C30", "Gelb", 2012, 190);

        car1.starts();

        car2.accelerates();
        car2.printSpeed();
    }
}