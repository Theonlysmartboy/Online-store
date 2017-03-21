/*
 * This application is property of Otema and is licenced under otema ©2017
 * No part of it whatsoever shall be shared or used unless under written permission by Otema
 * A breech of this may lead to prosecution.
 */
package com.otema.onlinestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.otema.onlinestore.domain.repository.ProductRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Otema
 */
@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public String list(Model model) {
        Date today = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd MMM yyy 'at' hh:mm:ss a zzz");
        SimpleDateFormat tf = new SimpleDateFormat("yyy");
        model.addAttribute("products", productRepository.getAllProducts());
        model.addAttribute("loadtime", "This page was created dynamically using Java on " + ft.format(today));
        model.addAttribute("copyrightyear", "All rights reserved © " + tf.format(today) + " Otema");
        return "products";
    }
}
