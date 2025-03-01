package com.h8h.solid_principles.dip.bad;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository{
    
    public List<String> getAllProductsName() {
        return Arrays.asList("soap", "toothpaste");
    }
}