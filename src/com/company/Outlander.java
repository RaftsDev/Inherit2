package com.company;

public class Outlander extends Car{
    private int serviceMonth;

    public Outlander(String name, String size, int serviceMonth) {
        super("Outlander", "4WD", 5, 5,6,false);
        this.serviceMonth = serviceMonth;
    }
}
