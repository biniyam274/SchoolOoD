package com.company;

public class Egea implements IPassengerCar {

    @Override
    public int gasNumberOfSeats(int no) {
        return no;
    }

    @Override
    public int gasConsumption(int gas) {
        return gas;
    }

    @Override
    public int motoPower(int motor) {
        return motor;
    }

    @Override
    public String modelName(String name) {
        return name;
    }
    @Override
    public String getDescription() {
        String dis = "Model :"+modelName("Egea")+"\n";
        dis +=  motoPower( 32)+" horsepower \n";
        dis += "Consume "+ gasConsumption(54) +" liters per kilometer\n";
        dis += "Number of seats :"+ gasNumberOfSeats(98) ;
        return dis;
    }
}
