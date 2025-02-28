package com.h8h.solid_principles.lsp.bad.productsaws;

public final class InHouseProduct extends Product {

    public void applyExtraDiscount() {
        discount = discount * 1.5;
    }
}
