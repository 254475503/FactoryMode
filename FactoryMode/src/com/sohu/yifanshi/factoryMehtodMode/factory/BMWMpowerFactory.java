package com.sohu.yifanshi.factoryMehtodMode.factory;

import com.sohu.yifanshi.factoryMehtodMode.Car.Car;

public class BMWMpowerFactory extends Factory {
    public String special;
    BMWMpowerFactory()
    {
        special = "运动底盘";
    }

    @Override
    public Car create() {
        System.out.println(special+"装载...");
        return null;
    }
}
