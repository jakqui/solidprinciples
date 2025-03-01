package com.h8h.solid_principles.dip.good.dependencyinjection;

import java.util.List;

public class ProductCatalog {
    // OPTION 3 INYECCION DE DEPENDENCIAS
    private ProductRepository productRepository;

    public ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void listAllProducts() { 
        // OPTION 1 INSTANCIAR OBJETO    
        // SQLProductRepository sqlProductRepository = new SQLProductRepository();
        // sqlProductRepository.getAllProductsNames();
        
        // OPTION 2 FACTORY METHOD
        // ProductRepository sqlProductRepository = ProductFactory.create();
        // List<String> products = sqlProductRepository.getAllProductsNames();

        // OPTION 3 INYECCION DE DEPENDENCIAS
        List<String> products = productRepository.getAllProductsNames();        

        for (String product : products) {
            System.out.println(product);
        }
    }
    
}
