package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Credential;

@Controller
public class BlogController {

    @GetMapping(value = "/login")
    public String viewLogin(Model model){
        model.addAttribute("credential", new Credential());
        return "login";
    }

    @PostMapping(value = "/login")
    public String doLogin(@ModelAttribute Credential credential, Model model){
        model.addAttribute("name", credential.getUsername());
        return "dashboard";
    }
}