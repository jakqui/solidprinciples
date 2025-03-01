package com.h8h.solid_principles.dip.good;

public class ProductFactory {
    
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
