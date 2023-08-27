package oop.classes;

public class Car {
    private String color;
    private String brand;
    private int maxSpeed;


    public Car(String color, String brand, int maxSpeed) {
        //this.color = color;
        //this.brand = brand;
        this(brand, maxSpeed);
        this.maxSpeed = maxSpeed;
    }

    //pentru a demonstra ca daca schimbam ordinea sau numarul parametrilor
    //le poti initializa diferit si se va executa alta cerinta
    public Car(int maxSpeed, String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }


    public void printAllCarParameters() {
        System.out.printf(String.format("The car ccolor is %s, the brand is %s and the maxim speed is %s \n", color, brand, maxSpeed));
        //"The car color is "+ color + ", the brand is " + brand + " and the maxim speed is " + maxSpeed) ;
    }


}
