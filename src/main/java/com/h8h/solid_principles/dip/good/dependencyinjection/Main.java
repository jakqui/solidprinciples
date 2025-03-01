package com.h8h.solid_principles.dip.good.dependencyinjection;

public class Main {
    
    public static void main(String[] args) {
        // OPTION 2 FACTORY METHOD
        // ProductCatalog productCatalog = new ProductCatalog();
        // productCatalog.listAllProducts();

        // OPTION 3 INYECCION DE DEPENDENCIAS
        ProductRepository productRepository = ProductFactory.create();
        ProductCatalog productCatalog = new ProductCatalog(productRepository);

        productCatalog.listAllProducts();
    }
}
