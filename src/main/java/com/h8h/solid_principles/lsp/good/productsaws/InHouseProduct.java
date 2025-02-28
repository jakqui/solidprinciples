package com.h8h.solid_principles.lsp.good.productsaws;

public final class InHouseProduct extends Product {

    @Override
    public double getDiscount() {
        this.applyExtraDiscount();
        return discount;
    }
    
    public void applyExtraDiscount() {
        discount = discount * 1.5;
    }
}
