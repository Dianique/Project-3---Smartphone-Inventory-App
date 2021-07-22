package com.objects;

public class Smartphone<price> {

    String manufacturer;    // company
    String model;            // specific model
    String operating;        // operating system
    int RM;                // memory in GB
    String Color;            // primary color
    int cam_lenses;        // number of camera lenses
    double price;            // how much does it cost


    public Smartphone(String man, String mod, String os, int ram, String color, int lens, double p) {
        manufacturer = man;
        model = mod;
        operating = os;
        RM = ram;
        Color = color;
        cam_lenses = lens;
        price = p;

    }

    public void display() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Operating: " + operating);
        System.out.println("Ram: " + RM);
        System.out.println("Color: " + Color);
        System.out.println("Lens: " + cam_lenses);
        System.out.println("Price: " + price);
        System.out.println("\n");

    }
}

