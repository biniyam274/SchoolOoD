package com.company;

public class Clio implements IPassengerCar{
    @Override
    public int gasNumberOfSeats(int no) {
        return no;
    }

    @Override
    public String getDescription() {
        String dis = "Model :"+modelName("CLio")+"\n";
        dis +=  motoPower( 21)+" horsepower \n";
        dis += "Consume "+ gasConsumption(32) +" liters per kilometer\n";
        dis += "Number of seats :"+ gasNumberOfSeats(54) ;
        return dis;
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
}
