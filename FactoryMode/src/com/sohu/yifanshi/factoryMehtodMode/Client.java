package com.sohu.yifanshi.factoryMehtodMode;

import com.sohu.yifanshi.factoryMehtodMode.Car.BMWM2;
import com.sohu.yifanshi.factoryMehtodMode.Car.BMWM3;
import com.sohu.yifanshi.factoryMehtodMode.Car.BenzAMGA45;
import com.sohu.yifanshi.factoryMehtodMode.Car.BenzAMGC63;
import com.sohu.yifanshi.factoryMehtodMode.factory.AMGA45Factory;
import com.sohu.yifanshi.factoryMehtodMode.factory.AMGC63Factory;
import com.sohu.yifanshi.factoryMehtodMode.factory.BMWM2Factory;
import com.sohu.yifanshi.factoryMehtodMode.factory.BMWM3Factory;

public class Client {
    public static void main(String[] args) {
        BMWM2 bmwm2 = new BMWM2Factory().create();
        BMWM3 bmwm3 = new BMWM3Factory().create();
        BenzAMGA45 amga45 = new AMGA45Factory().create();
        BenzAMGC63 amgc63 = new AMGC63Factory().create();
        //这就是工厂方法模式。每辆车都有对应的工厂。这样看似解决了普通工厂的开闭原则。因为只要多了一辆车，我们只要新增车辆类与
        //对应的车辆工厂就可以了。但是这样就出现了一个问题。一旦要造的东西躲起来了，类的个数也就会爆炸式的增长。比如说每辆车的
        //发动机排量都不一样，不同的车可以搭配不同的发动机。我们不仅要创建发动机工厂，汽车型号工厂，最后还拼装，将这两者排列组合
        //出来的工厂，这样会使得项目太过臃肿。所以我们需要抽象工厂模式。
        //超哥给邹煜设计的设计模式其实就是工厂方法模式的变种，只不过是抽象方法模式的反射调用版本。他们的情况是这样的。
        //公众号的活动有不同的场景值。场景值分前缀与后缀场景值。前缀场景决定大活动，比如说车展，裂变。后缀场景值决定小活动。
        //比如说广州车展，上海车展，还有转发赢小蓝车月卡，转发赢车展门票。之前邹煜是再一个类里面，写了一堆ifelse来判断场景值判断活动，
        //然后再把活动的过程写在ifelse里，顶多吧活动写成方法抽象出来，但是这一个类依然很臃肿庞大。而且活动越变越多，就需要更多的
        //ifelse来判断场景值。超哥的建议是，把这些活动一个一个的抽象成一个一个类。这写类的命名就用场景值，或者场景值的翻译做类名。
        //将这些活动分别写入这些类里。之后获得了场景值，我们只要吧场景值的前后缀拼装起来，也许需要再翻译一下。这样就得到了对应活动的类名
        //我们就可以根据类名来反射的调用这些类来实现活动。这样既遵循了开闭原则，也让类变得不那么臃肿了。其实工厂方法模式挺适合的，
        //因为微信小程序场景值也就两层。而且同时上线的活动也不多，所以类不会特别的多。
    }
}
