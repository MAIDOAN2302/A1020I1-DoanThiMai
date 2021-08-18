package vn.codegym.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;

import java.sql.SQLIntegrityConstraintViolationException;


@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(){
        return "homePage";
    }


    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(SessionStatus status) {
        status.setComplete();
        return "redirect:/";
    }

    @GetMapping("/403")
    public String getAccessDenied(){
        return "403-page";
    }

}
