package com.h8h.solid_principles.dip.good.dependencyinjection;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository{

    @Override
    public List<String> getAllProductsNames() {
        return Arrays.asList("soap", "toothpaste");
    }
}
