package com.sohu.yifanshi.factoryMehtodMode.factory;

import com.sohu.yifanshi.factoryMehtodMode.Car.BMWM3;
import com.sohu.yifanshi.factoryMehtodMode.Car.Car;

public class BMWM3Factory extends BMWMpowerFactory {
    @Override
    public BMWM3 create() {
        super.create();
        System.out.println("BMWM3 created!");
        return new BMWM3();
    }
}
