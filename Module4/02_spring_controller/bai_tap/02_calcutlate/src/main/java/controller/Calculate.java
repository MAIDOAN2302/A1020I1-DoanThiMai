package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Calculate {
    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }
}
