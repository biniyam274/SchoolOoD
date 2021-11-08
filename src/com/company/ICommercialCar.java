package com.company;

public interface ICommercialCar extends Vehicle {

    public  int volumeOfTrunk(int volume);

    @Override
    String getDescription();
}
