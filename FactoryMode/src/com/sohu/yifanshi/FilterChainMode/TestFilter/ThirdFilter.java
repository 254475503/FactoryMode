package com.sohu.yifanshi.FilterChainMode.TestFilter;

import com.sohu.yifanshi.FilterChainMode.MyFilter;

public class ThirdFilter extends MyFilter {
    @Override
    public boolean doFilter() {
        System.out.println("i am Third");
        return false;
    }
}
