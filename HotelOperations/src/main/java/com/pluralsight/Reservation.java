package com.pluralsight;

public class Reservation {

    private String roomType; //room type: king or double

    private int numberOfNights;

    private boolean isWeekend;


    public Reservation(String roomType, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public double getPrice(){
        double price = 0;
        if (this.roomType.equalsIgnoreCase("king")){
            price = 139.0;
        }
        else if (this.roomType.equalsIgnoreCase("double")){
            price = 124.0;
        }
        else{
            System.out.println("Invalid room type, please try again.");
        }
        if (this.isWeekend){
            price *= 1.1;
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend (boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal(){
        return this.getPrice() * this.numberOfNights;
    }

}
