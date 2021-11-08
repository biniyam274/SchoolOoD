package com.company;

public class FiatCarFactory implements AbstractFactory {
    @Override
    public IPassengerCar createPassengerCar() {
        return new Egea();
    }

    @Override
    public ICommercialCar createCommercialCar() {
        return  new Doblo();
    }
}
