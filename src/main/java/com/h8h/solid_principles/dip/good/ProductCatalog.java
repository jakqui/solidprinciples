package com.h8h.solid_principles.dip.good;

import java.util.List;

public class ProductCatalog {
    
    public void listAllProducts() {
        // FACTORY METHOD PARA OBTENER UNA INSTANCIA DEL OBJETO ProductRepository
        ProductRepository productRepository = ProductFactory.create();

        List<String> allProductsName = productRepository.getAllProductsName();

        // Display all products
    }
}
