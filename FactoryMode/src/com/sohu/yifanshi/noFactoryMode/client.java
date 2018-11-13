package com.sohu.yifanshi.noFactoryMode;

public class client {
    public static void main(String[] args) {//不使用工厂模式，则客户自己创建所需要的对象。这样客户和商品耦合度太高了。
        //这里也就是一个客户。宝马可是有着上千万个客户。我岂不是要写上千万次制造车的语句？所以我们需要工厂模式。
        BMWM2 bmwm2 = new BMWM2();
        BMWM3 bmwm3 = new BMWM3();
    }
}
