package com.sohu.yifanshi.FilterChainMode.TestFilter;

import com.sohu.yifanshi.FilterChainMode.MyFilterChain;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> thisClass = new Object(){
            public Class<?> getThisClassName() throws ClassNotFoundException {
                String clazzName = this.getClass().getName();
               return Class.forName(clazzName.substring(0,clazzName.lastIndexOf('$')));
            }

        }.getThisClassName();
        Method targetMethod = thisClass.getMethod("targetMethod");

        MyFilterChain myFilterChain = new MyFilterChain(thisClass,targetMethod,new TestClass(),null);
        myFilterChain.addFilter(new FirstFilter());
        myFilterChain.addFilter(new SeondFilter());
        myFilterChain.addFilter(new ThirdFilter());
        myFilterChain.executeChain();

    }
    public void targetMethod(){
        System.out.println("target method executed");
    }
}
