package com.h8h.solid_principles.lsp.good.productsaws;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new InHouseProduct();
        Product product4 = new Product();

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3); 
        products.add(product4);

        for (Product product : products) {
            System.out.println(product.getDiscount());
        }
        /*
         * LOS OBJETOS PUEDEN SER REEMPLAZADOS POR SUS SUBTIPOS
         * SIN AFECTAR LA CORRECCIÓN DEL PROGRAMA
         */
    }
}
