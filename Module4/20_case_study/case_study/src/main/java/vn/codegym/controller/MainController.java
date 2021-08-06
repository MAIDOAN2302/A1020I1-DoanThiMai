package vn.codegym.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(){
        return "homePage";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login/login";
    }

}
