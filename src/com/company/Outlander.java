package com.company;

public class Outlander extends Car{
    private int serviceMonth;

    public Outlander( int serviceMonth) {
        super("OutLander", "4WD", 5, 5, 6, false);
        this.serviceMonth = serviceMonth;
    }
}
