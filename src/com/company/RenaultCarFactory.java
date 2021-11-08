package com.company;

public class RenaultCarFactory implements AbstractFactory {
    @Override
    public IPassengerCar createPassengerCar() {
        return new Clio();
    }

    @Override
    public ICommercialCar createCommercialCar() {
        return new Kangoo();
    }
}
