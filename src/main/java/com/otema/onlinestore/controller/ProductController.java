/*
 * This application is property of Otema and is licenced under otema ©2017
 * No part of it whatsoever shall be shared or used unless under written permission by Otema
 * A breech of this may lead to prosecution.
 */
package com.otema.onlinestore.controller;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.otema.onlinestore.domain.Product;

/**
 *
 * @author Otema
 */
@Controller
public class ProductController {
  @RequestMapping("/products")
  public String list(Model model) {
    Product iphone = new Product("P1234","iPhone 5s", new
BigDecimal(500));
    iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
    iphone.setCategory("Smart Phone");
    iphone.setManufacturer("Apple");
    iphone.setUnitsInStock(1000);
    model.addAttribute("product", iphone);
    return "products";
  }
}
