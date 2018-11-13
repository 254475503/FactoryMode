package com.sohu.yifanshi.normalFactoryMode;

import com.sohu.yifanshi.normalFactoryMode.factory.NormalFactory;

public class Client {
    public static void main(String[] args) {
        NormalFactory normalFactory = new NormalFactory();
        normalFactory.creatBMW("M2");
        normalFactory.creatBMW("M3");
        normalFactory.creatBMW("760LI");
        //工厂模式的确完美的将客户和商品解耦了，但是遇到了设计模式中的开闭原则问题。所谓开闭原则就是，开放拓展，关闭修改。也就是说
        //你可以在原有的项目中添加新的类来达到添加功能的作用，但是不能修改原有的类与方法。我们设想一下。如果我们要生产新的车，比如
        //760LI,我们就必须在工厂类中的createBMW方法中新增生产760的语句了。这样就违反了开闭原则。所以我们想达到的目的是，添加新
        //的类用以生产新车。那么我们就得用到工厂方法模式了。
    }
}
