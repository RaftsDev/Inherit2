package com.company;

public class Outlander extends Car{
    private String serviceTime;

    public Outlander(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear, String serviceTime) {
        super(name, size, 4, 5, 5, false, 0);
        this.serviceTime = serviceTime;
    }
}
