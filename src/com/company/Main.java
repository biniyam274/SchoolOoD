package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractFactory fiatCarFactory  = new FiatCarFactory();
        AbstractFactory renaultCarFactory = new RenaultCarFactory();

        //Fiat Factory Commercial Car
        ICommercialCar commercialCar =  fiatCarFactory.createCommercialCar();

        System.out.println(commercialCar.getDescription());

        commercialCar =  renaultCarFactory.createCommercialCar();

        //Ranult Factory Commercial Car
        System.out.println(commercialCar.getDescription());

        IPassengerCar passengerCar =  renaultCarFactory.createPassengerCar();

        //Ranult Factory Passenger Car
        System.out.println(commercialCar.getDescription());

        passengerCar =  renaultCarFactory.createPassengerCar();


        //Fiat Factory Passenger Car
        System.out.println(passengerCar.getDescription());

    }
}
