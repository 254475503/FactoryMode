package com.sohu.yifanshi.factoryMehtodMode;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;


public class ReflectClient {
    public static final String BMW = "BMW";
    public static final String AMG = "AMG";
    public static final String Factory = "Factory";
    public static final String M2 = "M2";
    public static final String M3 = "M3";
    public static final String C63 = "C63";
    public static final String A45 = "A45";
    public static final String factortPackageName = "com.sohu.yifanshi.factoryMehtodMode.factory.";
    public static String className = "";
    public static String prefix = "";
    public static String suffix = "";

    public static void main(String[] args) {
        //这就是类似于超哥说的那个设计模式了。反射的调用工厂方法。再微信小程序中，我们把类名和场景值设置成一样的话，或者中间加
        //一点间隔，我们甚至连ifelse都不需要，我们只要将场景值直接拼装，然后直接反射调用类里面的方法就行了。注意一定要控制程序中
        //的魔法值。不然不小心再程序里碰到了魔法值并且再不知情的情况下修改了魔法值的话，这个BUG是十分难找的。
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose brand : 1.BMWMpower 2.AMG");
        String temp = scanner.nextLine();
        if(temp.equals("1"))
        {
            prefix = BMW;
            System.out.println("choose type: 1.M2 2.M3");
            temp = scanner.nextLine();
            if(temp.equals("1"))
                suffix = M2;
            else
                suffix = M3;
        }
        else
        {
            prefix = AMG;
            System.out.println("choose type: 1.C63 2.A45");
            temp = scanner.nextLine();
            if(temp.equals("1"))
                suffix = C63;
            else
                suffix = A45;
        }
        className = prefix + suffix;
        try {
            Class clazz = Class.forName(factortPackageName+className+Factory);
            Object object = clazz.newInstance();
            object.getClass().getDeclaredMethod("create").invoke(object,null);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
