package com.h8h.solid_principles.dip.good;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository{

    @Override
    public List<String> getAllProductsName() {
        return Arrays.asList("soap", "toothpaste");
    }
    
}
