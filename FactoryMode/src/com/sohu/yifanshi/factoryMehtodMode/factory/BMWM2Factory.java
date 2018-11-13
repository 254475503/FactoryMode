package com.sohu.yifanshi.factoryMehtodMode.factory;

import com.sohu.yifanshi.factoryMehtodMode.Car.BMWM2;
import com.sohu.yifanshi.factoryMehtodMode.Car.Car;

public class BMWM2Factory extends BMWMpowerFactory {
    @Override
    public BMWM2 create() {
        super.create();
        System.out.println("BMWM2 created!");
        return new BMWM2();
    }
}
