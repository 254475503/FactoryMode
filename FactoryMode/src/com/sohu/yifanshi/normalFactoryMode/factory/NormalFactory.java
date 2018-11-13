package com.sohu.yifanshi.normalFactoryMode.factory;

import com.sohu.yifanshi.normalFactoryMode.BMW;
import com.sohu.yifanshi.normalFactoryMode.BMWM2;
import com.sohu.yifanshi.normalFactoryMode.BMWM3;

public class NormalFactory {
    public BMW creatBMW(String type)
    {
        if(type.equals("M2"))
            return new BMWM2();
        else if(type.equals("M3"))
            return new BMWM3();
        else
            return null;

    }
}
