package com.company;

public interface IPassengerCar extends Vehicle{
    public  int gasNumberOfSeats(int no);

    @Override
    String getDescription();
}
