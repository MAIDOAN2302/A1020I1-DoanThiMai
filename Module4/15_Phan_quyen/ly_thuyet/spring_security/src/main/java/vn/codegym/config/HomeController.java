package vn.codegym.config;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String getHomePage(Model model, Principal principal){
        String txt_name = "No name";
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        if(principal != null && principal instanceof UserDetails){
//           txt_name = ((UserDetails) principal).getUsername();
//        }
//        txt_name = principal.getName();
        model.addAttribute("txt_name", txt_name + "_principal");
        return "hello";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}
