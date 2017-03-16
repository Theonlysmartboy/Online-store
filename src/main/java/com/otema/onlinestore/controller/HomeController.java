package com.otema.onlinestore.controller;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

/**
 *
 * @author Otema
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to Otema Store!");
        model.addAttribute("tagline", "The one and only amazing webstore");
        Date today = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd MMM yyy 'at' hh:mm:ss a zzz");
        SimpleDateFormat tf = new SimpleDateFormat("yyy");
        model.addAttribute("loadtime", "This page was created dynamically using Java on " + ft.format(today));
        model.addAttribute("copyrightyear", "All rights reserved © " + tf.format(today) + " Otema " );
        return "welcome";
    }
}
