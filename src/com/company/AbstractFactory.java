package com.company;

public interface AbstractFactory {
    public IPassengerCar createPassengerCar();
    public ICommercialCar createCommercialCar();
}
