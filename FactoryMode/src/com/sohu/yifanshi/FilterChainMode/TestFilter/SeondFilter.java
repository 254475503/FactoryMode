package com.sohu.yifanshi.FilterChainMode.TestFilter;

import com.sohu.yifanshi.FilterChainMode.MyFilter;

public class SeondFilter extends MyFilter {
    @Override
    public boolean doFilter() {
        System.out.println("i am second");
        return true;
    }
}
