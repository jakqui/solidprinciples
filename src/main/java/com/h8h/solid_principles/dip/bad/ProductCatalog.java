package com.h8h.solid_principles.dip.bad;

import java.util.List;

public class ProductCatalog {

    public void listAllProducts() {
        SQLProductRepository sqlProductRepository = new SQLProductRepository();

        List<String> allProductsName = sqlProductRepository.getAllProductsName();

        // Display all products

        // Aqui se viola el principio porque la clase SQLProductRepository
        // depende de la implementacion de la interfaz ProductRepository
        // y no deberia hacerlo
    }
}
