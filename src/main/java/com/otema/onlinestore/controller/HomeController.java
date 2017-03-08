package com.otema.onlinestore.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
/**
 *
 * @author Maseno
 */
@Controller
public class HomeController {
    @RequestMapping("/")
  public String welcome(Model model) {
    model.addAttribute("greeting", "Welcome to Otema Store!");
    model.addAttribute("tagline", "The one and only amazing webstore");
    Date today = new Date();
    model.addAttribute("time", today);
    return "welcome";
}
}