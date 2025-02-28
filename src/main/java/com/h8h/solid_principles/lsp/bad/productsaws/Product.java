package com.h8h.solid_principles.lsp.bad.productsaws;

public sealed class Product permits InHouseProduct {
    protected double discount = 20;

    public double getDiscount() {
        return discount;
    }
}
