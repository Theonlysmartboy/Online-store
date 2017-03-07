package com.otema.onlinestore.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Maseno
 */
@Controller
public class HomeController {
    @RequestMapping("/")
  public String welcome(Model model) {
    model.addAttribute("greeting", "Welcome to Otema Web Store!");
    model.addAttribute("tagline", "The one and only amazing webstore");
    return "welcome";
}
}
