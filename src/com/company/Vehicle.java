package com.company;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;

    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        currentDirection += direction;
        System.out.println("direction:"+currentDirection);
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("velocity:"+currentVelocity+" direction:"+currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void Stop() {
        currentVelocity = 0;
        System.out.println("Vehicle stoped");
    }
}
