package com.sohu.yifanshi.FilterChainMode;

import javafx.beans.binding.ObjectExpression;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class MyFilterChain {
    private List<MyFilter> filterList;
    private Class<?> endClass;
    private Method method;
    private Object[] args;
    private Object methodExecutor;
    public MyFilterChain(Class<?> endClass, Method method, Object methodExecutor, Object[] args){
        filterList = new ArrayList<>();
        this.endClass = endClass;
        this.method = method;
        this.args = args;
        this.methodExecutor = methodExecutor;
    }
    public void addFilter(MyFilter myFilter){
        MyFilter endFilter = filterList.isEmpty()?null:filterList.get(filterList.size()-1);
        if(endFilter!=null){
            endFilter.nextFilter = myFilter;
        }
        filterList.add(myFilter);
    }

    public boolean executeChain() throws InvocationTargetException, IllegalAccessException {
        boolean chainFlag = false;
        if(filterList!=null&&!filterList.isEmpty()){
            chainFlag = filterList.get(0).executeChain();
        }
        return chainFlag;
    }
}
