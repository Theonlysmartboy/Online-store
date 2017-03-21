package com.otema.onlinestore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.otema.onlinestore.domain.Product;
import com.otema.onlinestore.domain.repository.ProductRepository;

/**
 *
 * @author Otema
 */
@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> listOfProducts = new ArrayList<Product>();

    public InMemoryProductRepository() {
        Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        Product laptop_dell = new Product("P1235", "Dell Inspiron", new BigDecimal(700));
        laptop_dell.setDescription("Dell Inspiron 14-inch Laptop (Black) with 3rd Generation Intel Core processors");
        laptop_dell.setCategory("Laptop");
        laptop_dell.setManufacturer("Dell");
        laptop_dell.setUnitsInStock(1000);
        Product tablet_Nexus = new Product("P1236", "Nexus 7", new BigDecimal(300));
        tablet_Nexus.setDescription("Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm Snapdragon™ S4 Pro processor");
        tablet_Nexus.setCategory("Tablet");
        tablet_Nexus.setManufacturer("Google");
        tablet_Nexus.setUnitsInStock(1000);
        Product tecno = new Product("T1234", "Tecno L8", new BigDecimal(600));
        tecno.setDescription("Tecno L8 smartphone with 4.00-inch 640x1136 display, 2Gb RAM 16Gb, ROM 8-megapixel rear camera and boom player");
        tecno.setCategory("Smart Phone");
        tecno.setManufacturer("Tecno Inc");
        tecno.setUnitsInStock(80);
        listOfProducts.add(tecno);
        listOfProducts.add(iphone);
        listOfProducts.add(laptop_dell);
        listOfProducts.add(tablet_Nexus);
    }

    @Override
    public List<Product>
            getAllProducts() {
        return listOfProducts;
    }
}