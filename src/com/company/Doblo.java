package com.company;

public class Doblo implements ICommercialCar {

    @Override
    public int volumeOfTrunk(int volume) {
        return volume;
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
        String dis = "Model :" + modelName("Doblo") + "\n";
        dis += motoPower(19) + " horsepower \n";
        dis += "Consume " + gasConsumption(21) + " liters per kilometer\n";
        dis += "Number of seats :" + volumeOfTrunk(43);
        return dis;
    }

}
