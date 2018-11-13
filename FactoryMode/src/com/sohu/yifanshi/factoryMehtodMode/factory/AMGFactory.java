package com.sohu.yifanshi.factoryMehtodMode.factory;

import com.sohu.yifanshi.factoryMehtodMode.Car.Car;

public class AMGFactory extends Factory {
    public String special;
    AMGFactory(){
        special = "AMGENGINE";
    }
    @Override
    public Car create() {
        System.out.println(special+"装载...");
        return null;
    }
}
