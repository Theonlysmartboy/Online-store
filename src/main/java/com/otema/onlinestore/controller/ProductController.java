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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Otema
 */
@Controller
public class ProductController {

    @RequestMapping("/products")
    public String list(Model model) {
        Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        Product tecno = new Product("T1234", "Tecno L8", new BigDecimal(600));
        tecno.setDescription("Tecno L8 smartphone with 4.00-inch 640x1136 display, 2Gb RAM 16Gb, ROM 8-megapixel rear camera and boom player");
        tecno.setCategory("Smart Phone");
        tecno.setManufacturer("Tecno Inc");
        tecno.setUnitsInStock(80);
        Date today = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd MMM yyy 'at' hh:mm:ss a zzz");
        SimpleDateFormat tf = new SimpleDateFormat("yyy");
        model.addAttribute("product", iphone);
        model.addAttribute("product1", tecno);
        model.addAttribute("loadtime", "This page was created dynamically using Java on " + ft.format(today));
        model.addAttribute("copyrightyear", "All rights reserved © " + tf.format(today) + " Otema");
        return "products";
    }
}
