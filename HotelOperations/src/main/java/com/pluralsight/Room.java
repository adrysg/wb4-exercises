package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds(){
        return numberOfBeds;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isDirty(){
        return this.dirty;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public boolean isAvailable(){
        return ( !this.isDirty() && !this.isOccupied() );
    }

    public void checkIn(){
        if (!occupied && !dirty){
            this.dirty = true;
            this.occupied = true;
        }
    }

    public void checkOut(){
        this.occupied = false;
        this.dirty = true;
    }

    public void cleanRoom(){
            this.dirty = false;
        }

    }

