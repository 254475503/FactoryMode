package com.sohu.yifanshi.FilterChainMode;

public abstract class MyFilter {
    protected MyFilter nextFilter;
    public abstract boolean doFilter();
    public boolean executeChain(){
        if(doFilter()){
            if(nextFilter!=null){
                return nextFilter.executeChain();
            }
            return true;
        }

        return false;
    }
}
