package com.pluralsight;

public class Reservation {

    public double kingRoom = 139;
    public double doubleRoom = 124;
    String getRoomType;
    public double getPrice;
    public int numberOfNights;
    public boolean isWeekend;
    public double reservationTotal;


    public Reservation(String getRoom, double getPrice, int numberOfNights, boolean isWeekend, double reservationTotal){
        this.getRoomType = getRoomType;
        this.getPrice = getPrice;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public double getKingRoom() {
        return kingRoom;
    }

    public double getDoubleRoom() {
        return doubleRoom;
    }


    public double getGetPrice() {
        return getPrice;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public getRoomType(){

    }
}
