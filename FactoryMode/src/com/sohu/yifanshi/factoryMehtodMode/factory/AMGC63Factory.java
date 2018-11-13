package com.sohu.yifanshi.factoryMehtodMode.factory;

import com.sohu.yifanshi.factoryMehtodMode.Car.BenzAMGA45;
import com.sohu.yifanshi.factoryMehtodMode.Car.BenzAMGC63;
import com.sohu.yifanshi.factoryMehtodMode.Car.Car;

public class AMGC63Factory extends AMGFactory {
    @Override
    public BenzAMGC63 create() {
        super.create();
        System.out.println("AMGC63 created!");
        return  new BenzAMGC63();
    }
}
