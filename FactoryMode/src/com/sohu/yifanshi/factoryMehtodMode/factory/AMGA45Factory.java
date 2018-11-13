package com.sohu.yifanshi.factoryMehtodMode.factory;

import com.sohu.yifanshi.factoryMehtodMode.Car.BenzAMGA45;
import com.sohu.yifanshi.factoryMehtodMode.Car.Car;

public class AMGA45Factory extends AMGFactory {
    @Override
    public BenzAMGA45 create() {
        super.create();
        System.out.println("AMGA45 created!");
        return new BenzAMGA45();
    }
}
